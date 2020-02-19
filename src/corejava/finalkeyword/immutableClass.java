package corejava.finalkeyword;

import java.util.Date;

public final class immutableClass {
	
	
	private final Integer immutableVar;
	
	
	private String immutableVar2;
	
	private final Date mutableVar; 
	
	private immutableClass(Integer gg1, String gg2, Date date) {
		this.immutableVar = gg1;
		this.immutableVar2 = gg2;
		this.mutableVar = date;
	}
	
	 public static  immutableClass createNewInstance (Integer ff1, String ff2, Date date) {
		 return new immutableClass(ff1, ff2, date);
				 
	 }
	 
	 public Integer getImmutableVar1() {
		 return immutableVar;
	 }
	 public String getImmutableVar2() {
		 return immutableVar2;
	 }
	 
	 public Date getMutableVar() {
		 return new Date(mutableVar.getTime());
	 }

	@Override
	public String toString() {
		return "immutableClass [immutableVar=" + immutableVar + ", immutableVar2=" + immutableVar2 + ", mutableVar="
				+ mutableVar + "]";
	}

}
