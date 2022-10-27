import menu.MenuLocadora;

public class Main {
    
    public static void main(String[] args) {

        /*Calendar c1 = Calendar.getInstance();
        c1.set(1995, 5, 14);

		System.out.print("Ano: "+c1.get(Calendar.YEAR));
		System.out.print(" Mês: "+c1.get(Calendar.MONTH));
		System.out.println(" Dia do Mês: "+c1.get(Calendar.DAY_OF_MONTH));

        Calendar c2 = Calendar.getInstance();
        c2.set(1996, 5, 14);

        System.out.print("Ano: "+c2.get(Calendar.YEAR));
		System.out.print(" Mês: "+c2.get(Calendar.MONTH));
		System.out.println(" Dia do Mês: "+c2.get(Calendar.DAY_OF_MONTH));


        System.out.println((c2.getTimeInMillis() / 1000 / 60 / 60 / 24) - (c1.getTimeInMillis() / 1000 / 60 / 60 / 24));
       */

       MenuLocadora menuLocadora = new MenuLocadora();
       
       //menuLocadora.adicionaVeiculo();
       //menuLocadora.adicionaCliente();
       menuLocadora.adicionarLocacao();

       

    }

}