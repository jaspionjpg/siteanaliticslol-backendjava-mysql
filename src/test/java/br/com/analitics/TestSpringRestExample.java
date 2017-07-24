package br.com.analitics;

public class TestSpringRestExample {

	public static void main(String args[]){
//		Resposta resposta = new Resposta();
//		Class<Resposta> respostaas = (Class<Resposta>) resposta.getClass();
//		for(Field f : respostaas.getDeclaredFields()){
//            System.out.println(f.getName());
//		}
//		for(Method m : respostaas.getDeclaredMethods()){
//            System.out.println(m.getName());
//		}
		get();
		System.out.println("*****");
		System.out.println("*****");
		getAll();
		System.out.println("*****");
		System.out.println("*****");
		create();
		
	}

	
	 public static void get() {
//        RestTemplate restTemplate = new RestTemplate();
//        try{
//	        ResponseEntity<Resposta> quote = restTemplate.getForEntity("http://localhost:8080/apilelloimoveis-service/rest/empresaslellogame/1", Resposta.class);
//	        
//	        System.out.println(quote.getBody().toString());
//        } catch (HttpClientErrorException e ){
//        	System.out.println(e);
//        }
    }
	 
	 public static void getAll() {
//		 RestTemplate restTemplate = new RestTemplate();
//		 try{
//			ResponseEntity<List<Resposta>> rateResponse =
//		        	restTemplate.exchange("http://localhost:8080/apilelloimoveis-service/rest/empresaslellogame", HttpMethod.GET, null, new ParameterizedTypeReference<List<Resposta>>() {});
//			List<Resposta> rates = rateResponse.getBody();
//			
//	        for(Resposta map : rates){
//				System.out.println(map.toString());
//			}
//	        
//		  } catch (HttpClientErrorException e ){
//	      	System.out.println(e);
//	      }
    }

	public static void create() {
//		RestTemplate restTemplate = new RestTemplate();
//		Resposta emp = new Resposta();
//		emp.setDescricaoEmpresa("Empresa Legal");
//		emp.setQtdeMaximaCupons(10);
//		emp.setValorPontuacao(new BigDecimal(3));
//	    
//		try{
//			
//			Resposta response = restTemplate.postForObject("http://localhost:8080/apilelloimoveis-service/rest/empresaslellogame", emp, Resposta.class);
//			System.out.println(response.toString());
//	    
//	    } catch (HttpClientErrorException e ){
//	      	System.out.println(e);
//        }
	}

}
