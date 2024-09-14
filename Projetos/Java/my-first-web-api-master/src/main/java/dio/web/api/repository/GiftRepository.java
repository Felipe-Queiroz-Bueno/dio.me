package dio.web.api.repository;

import dio.web.api.model.Gift;
import dio.web.api.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GiftRepository {
    private final List<Gift> gifts = new ArrayList<>();
    private int nextId = 1;

    public Gift save(Gift gift) {
        if (gift.getId() == null) {
            gift.setId(nextId++);
            gifts.add(gift);
            System.out.println("SAVE - Recebendo o presente na camada de repositório");
        } else {
            // Atualização do presente, se já tiver um ID
            int index = -1;
            for (int i = 0; i < gifts.size(); i++) {
                if (gifts.get(i).getId().equals(gift.getId())) {
                    index = i;
                    break;
                }
            }
            if (index >= 0) {
                gifts.set(index, gift);
                System.out.println("UPDATE - Recebendo o presente na camada de repositório");
            } else {
                // Lida com o caso em que o ID especificado não corresponde a nenhum presente existente
                System.out.println("Erro: Não foi possível encontrar um presente com o ID especificado.");
                return null;
            }
        }
        System.out.println(gift);
        return gift;
    }

    public void deleteById(Integer id) {
        for (Gift gift : gifts) {
            if (gift.getId().equals(id)) {
                gifts.remove(gift);
                System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir um presente", id));
                System.out.println(id);
                return;
            }
        }
        System.out.println("Erro: Não foi possível encontrar um presente com o ID especificado.");
    }

    public List<Gift> findAll() {
        System.out.println("LIST - Listando os presentes do sistema");
        List<Gift> gifts = new ArrayList<>();
        gifts.add(new Gift("geladeira","geladeira brastemp", 2000));
        gifts.add(new Gift("TV","TV SAMSUNG 20 POL.", 2500));
        return gifts;
    }

    public Gift findById(Integer id) {
        for (Gift gift : gifts) {
            if (gift.getId().equals(id)) {
                System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um presente", id));
                return gift;
            }
        }
        System.out.println("Erro: Não foi possível encontrar um presente com o ID especificado.");
        return null;
    }

    // Outros métodos de pesquisa, se necessário

    public List<Gift> findByName(String name) {
        List<Gift> matchingGifts = new ArrayList<>();
        for (Gift gift : gifts) {
            if (gift.getName().equalsIgnoreCase(name)) {
                matchingGifts.add(gift);
            }
        }
        System.out.println(String.format("FIND/name - Recebendo o nome: %s para localizar presentes", name));
        return matchingGifts;
    }
}