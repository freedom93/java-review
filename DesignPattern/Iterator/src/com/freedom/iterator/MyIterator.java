package com.freedom.iterator;

public class MyIterator implements Iterator{
	
	private Collection collector;
	private int pos = -1;
	
	public MyIterator(Collection collection){
		this.collector = collection;
	}

	@Override
	public Object previous() {
		if(pos > 0)
			pos--;
		return collector.get(pos);
	}

	@Override
	public Object next() {
		if(pos < collector.size()-1)
			pos++;
		return collector.get(pos);
	}

	@Override
	public boolean hasNext() {
		if(pos < collector.size()-1){
			return true;
		}else{
			return false;
		}
	}

	@Override
	public Object first() {
		pos = 0;
		return collector.get(pos);
	}

}
