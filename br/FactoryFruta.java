package ufpb.br;

 class FactoryFruta {		
	 
	   public Fruta getFruta (String nome, Tipo tipo) {
	   
		if (Tipo.FRUTAS_CITRICAS == tipo) 
	            return new FrutasCitricas(nome);
	       
		if (Tipo.FRUTAS_VERMELHAS == tipo)
	            return new FrutasVermelhas(nome);
		
		return null;
		
	    }
	 
	}

