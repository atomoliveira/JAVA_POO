package Lista3;

public class pilha {
	
        public Object[] pilha;
	    public int posicaoPilha;

	    public Pilha() {
	        this.posicaoPilha = -1;
	
	        this.pilha = new Object[23];
	
	    }

	    public boolean pilhaVazia() {
	        //isEmpty
	        if (this.posicaoPilha == -1) {
	            return true;
	        }
	        return false;
	    }

	    public int tamanho() {
	        
	        if (this.pilhaVazia()) {
	            return 0;
	        }
	        return this.posicaoPilha + 1;
	    }

	    public Object exibeUltimoValor() {
	        //top
	        if (this.pilhaVazia()) {
	            return null;
	        }
	        return this.pilha[this.posicaoPilha];
	    }

	    public Object desempilhar() {
	        
	        if (pilhaVazia()) {
	            return null;
	        }
	        return this.pilha[this.posicaoPilha--];
	    }

	    public void empilhar(Object valor) {
	        // push
	        if (this.posicaoPilha < this.pilha.length - 1) {
	            this.pilha[++posicaoPilha] = valor;
	        }

	    }
		
	}

}
