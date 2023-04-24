package funcionamento;
/*.
Esta segunda lista trabalha os conceitos do Encapsulamento! 



O objetivo do projeto é desenvolver uma aplicação relacionada a bancos, vamos aplicar os conceitos de POO e as regras de negócio para a estruturação do código. 

Cadastre os clientes em seu banco, faça depósitos, faça saques e transferências para outras contas de clientes. 

Logo abaixo, existe um diagrama de classe para que você possa dar o pontapé inicial. */


import java.util.Scanner;


import cConta.Conta;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);
        
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int codOpe=0;
        int numConta=0;
        int numConta2=0;
        int contagem=1;
        int codOpe2=0;
        double valor=0;
        Conta cc=new Conta();
        Conta cc2=new Conta();
        Conta cc3=new Conta();
        do{
        System.out.println("Olá Seja muito bem Vindo ao Banco ABC!!");
        System.out.println("Digite 1 para Abertura de conta, 2 para Depósitos, 3 para saque, 4 para tranfência, 5 para Saldo ou 6 para Sair");
        codOpe=sc.nextInt();
        if(codOpe>0 && codOpe<7){
        if(codOpe==1 && contagem<4){
                if(contagem==1){
                System.out.println("Digite o nome do Titular da conta: ");
                cc.setTitular(sc.next());
                cc.setNumConta(contagem);
                contagem++;
                System.out.println("Você deseja realizar um depósito hoje? 1 para sim e 2 para não");
                codOpe2=sc.nextInt();
                if(codOpe2==1){
                    System.out.println("Por favor digite o valor a ser depositado:");
                    valor=sc.nextInt();
                    cc.setSaldo(valor, numConta);
                    System.out.println("Nova conta cadastrada com sucesso!");
                    System.out.println("Titular da conta: "+cc.getTitular(numConta));
                    System.out.println("Número da conta: "+cc.getNumConta());
                    System.out.println("Saldo Hoje: "+cc.getSaldo(numConta));
                }
                else{
                    System.out.println("Nova conta cadastrada com sucesso!");
                    System.out.println("Titular da conta: "+cc.getTitular(numConta));
                    System.out.println("Número da conta: "+cc.getNumConta());
                    System.out.println("Saldo Hoje: "+cc.getSaldo(numConta));

                }
            }
            else if(contagem==2){
                System.out.println("Digite o nome do Titular da conta: ");
                cc2.setTitular(sc.next());
                cc2.setNumConta(contagem);
                contagem++;
                System.out.println("Você deseja realizar um depósito hoje? 1 para sim e 2 para não");
                codOpe2=sc.nextInt();
                if(codOpe2==1){
                    System.out.println("Por favor digite o valor a ser depositado:");
                    valor=sc.nextInt();
                    cc2.setSaldo(valor, numConta);
                    System.out.println("Nova conta cadastrada com sucesso!");
                    System.out.println("Titular da conta: "+cc2.getTitular(numConta));
                    System.out.println("Número da conta: "+cc2.getNumConta());
                    System.out.println("Saldo Hoje: "+cc2.getSaldo(numConta));
                }
                else{
                    System.out.println("Nova conta cadastrada com sucesso!");
                    System.out.println("Titular da conta: "+cc2.getTitular(numConta));
                    System.out.println("Número da conta: "+cc2.getNumConta());
                    System.out.println("Saldo Hoje: "+cc2.getSaldo(numConta));

                }
            }
                
            else if(contagem==3){
                System.out.println("Digite o nome do Titular da conta: ");
                cc3.setTitular(sc.next());
                cc3.setNumConta(contagem);
                contagem++;
                System.out.println("Você deseja realizar um depósito hoje? 1 para sim e 2 para não");
                codOpe2=sc.nextInt();
                if(codOpe==1){
                    System.out.println("Por favor digite o valor a ser depositado:");
                    valor=sc.nextInt();
                    cc3.setSaldo(valor, numConta);
                    System.out.println("Nova conta cadastrada com sucesso!");
                    System.out.println("Titular da conta: "+cc3.getTitular(numConta));
                    System.out.println("Número da conta: "+cc3.getNumConta());
                    System.out.println("Saldo Hoje: "+cc3.getSaldo(numConta));
                }
                else{
                    System.out.println("Nova conta cadastrada com sucesso!");
                    System.out.println("Titular da conta: "+cc3.getTitular(numConta));
                    System.out.println("Número da conta: "+cc3.getNumConta());
                    System.out.println("Saldo Hoje: "+cc3.getSaldo(numConta));

                }
           
            }
            else{
                System.out.println("Por favor Procure a gerência!");
            }
        }
       
                     if(codOpe==2){
                        System.out.println("Digite o número da conta:");
                        numConta=sc.nextInt();
                        System.out.println("Confira os dados");
                        if (numConta==1){
                        System.out.println("Titular da conta: "+cc.getTitular(numConta));
                        }
                        else if (numConta==2){
                            System.out.println("Titular da conta: "+cc2.getTitular(numConta));
                            }
                            else if (numConta==3){
                                System.out.println("Titular da conta: "+cc3.getTitular(numConta));
                                }

                        System.out.println("Confirma?: 1 para sim e 2 para não");
                        codOpe2=sc.nextInt();
                        if(codOpe2==2){
                            System.out.println("Obrigado por utilizar os serviços do banco ABC!");
                        }
                        else{
                        System.out.println("Por favor digite o valor a ser depositado:");
                        valor=sc.nextDouble();
                        if(numConta==1){
                        cc.depositar(valor, numConta);
                        System.out.println("O saldo é: "+cc.getSaldo(numConta));
                        }
                        else if(numConta==2){
                            cc2.depositar(valor, numConta);
                            System.out.println("O saldo é: "+cc2.getSaldo(numConta));
                            }
                            else if(numConta==3){
                                cc3.depositar(valor, numConta);
                                System.out.println("O saldo é: "+cc3.getSaldo(numConta));
                                }
                        }
                    }
                        else if(codOpe==3){
                            System.out.println("Digite o número da conta:");
                            numConta=sc.nextInt();
                            if (numConta==1){
                                System.out.println("Titular da conta: "+cc.getTitular(numConta));
                                }
                                else if (numConta==2){
                                    System.out.println("Titular da conta: "+cc2.getTitular(numConta));
                                    }
                                    else if (numConta==3){
                                        System.out.println("Titular da conta: "+cc3.getTitular(numConta));
                                        }
                            System.out.println("Confirma?: 1 para sim e 2 para não");
                            codOpe2=sc.nextInt();
                            if(codOpe2==2){
                                System.out.println("Obrigado por utilizar os serviços do banco ABC!");
                            }
                            else{
                            System.out.println("Por favor digite o valor a ser sacado:");
                            valor=sc.nextDouble();
                            if(numConta==1){
                            cc.sacar(valor, numConta);
                            System.out.println("O saldo é: "+cc.getSaldo(numConta));
                            }
                            if(numConta==2){
                                cc2.sacar(valor, numConta);
                                System.out.println("O saldo é: "+cc2.getSaldo(numConta));
                                }
                                if(numConta==3){
                                    cc3.sacar(valor, numConta);
                                    System.out.println("O saldo é: "+cc3.getSaldo(numConta));
                                    }
                            }
                        }
                        else if(codOpe==4){
                            System.out.println("Digite o número da conta que o valor será debitado:");
                            numConta=sc.nextInt();
                            System.out.println("Digite o número da conta que o valor será creditado:");
                            numConta2=sc.nextInt();
                            System.out.println("Confira os dados");
                            System.out.println("Titular da conta de onde o valor será debitado: "+cc.getTitular(numConta));
                            System.out.println("Titular da conta de onde o valor será creditado: "+cc2.getTitular(numConta2));
                            System.out.println("Confirma?: 1 para sim e 2 para não");
                            codOpe2=sc.nextInt();
                            if(codOpe2==2){
                                System.out.println("Obrigado por utilizar os serviços do banco ABC!");
                            }
                            else{
                            System.out.println("Por favor digite o valor a ser transferido:");
                            Double valor2=sc.nextDouble();
                            int x=0;
                            if (numConta==1){
                                cc.sacar(valor2, numConta);
                                x=1;
                            }
                            else if (numConta==2){
                                cc2.sacar(valor2, numConta);
                                x=1;
                            }
                            else if (numConta==3){
                                cc3.sacar(valor2, numConta);
                                x=1;
                            }
                            if(x==1){
                            if (numConta2==1){
                                cc.depositar(valor2, numConta2);
                            }
                            else if (numConta2==2){
                                cc2.depositar(valor2, numConta2);
                            }
                            else if (numConta2==3){
                                cc3.depositar(valor2, numConta2);
                            }
                        }


                            if(numConta==1){
                            System.out.println("O saldo atual é: "+cc.getSaldo(numConta));
                                }
                                else if(numConta==2){
                                    System.out.println("O saldo atual é: "+cc2.getSaldo(numConta));
                                        }
                                        else if(numConta==3){
                                            System.out.println("O saldo atual é: "+cc3.getSaldo(numConta));
                                                }

                            }
                        }
            
                        else if(codOpe==5){
                            System.out.println("Digite o número da conta:");
                            numConta=sc.nextInt();
                            System.out.println("Confira os dados");
                            if (numConta==1){
                                System.out.println("Titular da conta: "+cc.getTitular(numConta));
                                }
                                else if (numConta==2){
                                    System.out.println("Titular da conta: "+cc2.getTitular(numConta));
                                    }
                                    else if (numConta==3){
                                        System.out.println("Titular da conta: "+cc3.getTitular(numConta));
                                        }
                            System.out.println("Confirma?: 1 para sim e 2 para não");
                            codOpe2=sc.nextInt();
                            if(codOpe2==2){
                                System.out.println("Obrigado por utilizar os serviços do banco ABC!");
                            }
                            else{
                                if(numConta==1){
                            System.out.println("O saldo atual é: "+cc.getSaldo(numConta));
                                }
                                else if(numConta==2){
                                    System.out.println("O saldo atual é: "+cc2.getSaldo(numConta));
                                        }
                                        else if(numConta==3){
                                            System.out.println("O saldo atual é: "+cc3.getSaldo(numConta));
                                                }
                            }
                        }
            } 
            else{
                System.out.println("Código de operação inválido");
            }          
    }while(contagem<5);
    sc.close();  
}
}
            
            
        
    


           
        
    

