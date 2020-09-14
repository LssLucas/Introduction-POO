package introducao_poo;

public class exemplo1 {
		// TODO Auto-generated method stub
		/*atributo 1 da classe exemplo1*/
		private String primeiroNome;
		/*atributo 2 da classe exemplo1*/
		private String nomesDoMeio;
		/*atributo 3 da classe exemplo1*/
		private String ultimoNome;
		
		/*Construtore executa procedimentos*/
		public exemplo1 (String primeiro, String meio, String ultimo) {
			/*atributo 1 do contrutor exemplo1*/
			primeiroNome  = primeiro;
			/*atributo 2 do contrutor exemplo1*/
			nomesDoMeio = meio;
			/*atributo 3 do contrutor exemplo1*/
			ultimoNome = ultimo;
		}
		
		/*Method*/
		public String getNomeCompleto() {
			String nomeCompleto = primeiroNome+" "+nomesDoMeio+" "+ultimoNome;
			return nomeCompleto;
 		}

}
