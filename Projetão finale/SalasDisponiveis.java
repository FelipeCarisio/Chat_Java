/**
@author Felipe Carisio, Ivan Knobel, Jo�o Augusto

Classe salasDisponiveis
*/

public class SalasDisponiveis implements Coisa
{
    private String conteudo;

    /**
	Construtor da classe
	@param salasDisponiveis que � um aray com todas as salas
	@throws se o par�metro for nulo
    */
	public SalasDisponiveis(String[] salasDisponiveis) throws Exception
	{
		if(salasDisponiveis != null)
		{
		   for(String i : salasDisponiveis)
		   this.conteudo += i + "\n";
		}
		else
			throw new Exception("N�o h� de onde se pegar salas");
	}

    /**
	hashCode da classe
    */
	public int hashCode()
	{
		int ret = 3 * 13 + conteudo.hashCode();
		return ret;
	}

    /**
	toString da classe
    */
	public String toString()
	{
		return this.conteudo;
	}

    /**
	equals da classe
    */
	public boolean equals(Object x)
	{
		if(x == this)
		  return true;
		if(x == null)
		  return false;
		if(x.getClass() != this.getClass())
		return false;

		SalasDisponiveis ret = (SalasDisponiveis)x;
		if(this.conteudo != ret.conteudo)
		return false;

		return true;
	}
}