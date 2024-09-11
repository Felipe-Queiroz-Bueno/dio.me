using DIO.Bank.Enum;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DIO.Bank.Conta
{
    internal class Conta
    {
        private TipoConta TipoConta { get; set; }
        private double Saldo { get; set; }
        private double Credito { get; set; }
        private string Nome { get; set; }

        public Conta(TipoConta TipoConta, double Saldo, double Credito, string Nome)
        {
            this.TipoConta = TipoConta;
            this.Saldo = Saldo;
            this.Credito = Credito;
            this.Nome = Nome;
        }

        public bool Sacar(double valorSaque)
        { 
            if(this.Saldo - valorSaque < (this.Credito*-1))
            {
                Console.WriteLine("Saldo Insuficiente!");
                return false;
            }

            this.Saldo -= valorSaque;
            Console.WriteLine($"Saldo Atual é de : {this.Saldo}");

            return true;
        }

        public void Depositar(double valorDeposito)
        { 
            this.Saldo += valorDeposito;

            Console.WriteLine($"Olá {this.Nome} o seu saldo atual é : {this.Saldo}");
        }

        public void Transferir(double valorTransferencia, Conta contaDestino)
        {
            if (this.Sacar(valorTransferencia)) 
            {
                contaDestino.Depositar(valorTransferencia);
            }
        }

        public override string ToString()
        {
            return $"TipoConta {this.TipoConta}\n Nome {this.Nome}\n Saldo {this.Saldo}\n Crédito {this.Credito}";
        }
    }
}
