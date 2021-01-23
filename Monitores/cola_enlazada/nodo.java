class nodo
{
	private String info;
	private nodo prox;
	public nodo()			
	{	info = "";
		prox=null;
	}
	public void setinfo(String s1)
	{	
		info = s1;
	}
	public void setprox(nodo p)
	{	
		prox = p;
	}
	public String getinfo()
	{	
		return info;
	}
	public nodo getprox()
	{	
		return prox;
	}
}
