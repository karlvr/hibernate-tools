package org.hibernate.tool.proxies;


public class EqualBean2 implements EqualBean2Proxy {

	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * The equals implementation previous generated by hbm2java.
	 */
	public boolean equals(Object other) {
        if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !org.hibernate.Hibernate.getClass(other).equals(getClass()) ) return false;
		 EqualBean2Proxy castOther = ( EqualBean2Proxy ) other; 
        
		 return (this.getId()==castOther.getId());
  }
  
  public int hashCode() {
        int result = 17;
        
        result = 37 * result + (int) this.getId();
        
        
        
        
        
        
        
        return result;
  }  
}
