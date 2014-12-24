package com.freedom.builder2;

import java.util.ArrayList;

public class Director {

	private ArrayList<String> sequence = new ArrayList();
	private WhiteHumanBuilder whiteHumanBuilder = new WhiteHumanBuilder();
	private BlackHumanBuilder blackHumanBuilder = new BlackHumanBuilder();

	//A型白人
	public WhiteHuman getAHumanModel() {
		// 清理场景，这里一定要注意
		this.sequence.clear();
		// 这只WhiteHuman的执行顺序
		this.sequence.add("say");
		this.sequence.add("simle");
		// 按照顺序返回一个先会说再会笑的白人
		this.whiteHumanBuilder.setSequence(this.sequence);
		return (WhiteHuman) this.whiteHumanBuilder.getHumanModel();
	}

	//B型白人
	public WhiteHuman getBHumanModel() {
		// 清理场景，这里一定要注意
		this.sequence.clear();
		// 这只WhiteHuman的执行顺序
		this.sequence.add("simle");
		this.sequence.add("say");
		// 按照顺序返回一个先会笑再会说的白人
		this.whiteHumanBuilder.setSequence(this.sequence);
		return (WhiteHuman) this.whiteHumanBuilder.getHumanModel();
	}

	//C型黑人
	public BlackHuman getCHumanModel() {
		// 清理场景，这里一定要注意
		this.sequence.clear();
		// 这只WhiteHuman的执行顺序
		this.sequence.add("say");
		this.sequence.add("smile");
		// 按照顺序返回一个先会说再会笑的黑人
		this.blackHumanBuilder.setSequence(this.sequence);
		return (BlackHuman) this.blackHumanBuilder.getHumanModel();
	}

	//D型黑人
	public BlackHuman getDHumanModel() {
		// 清理场景，这里一定要注意
		this.sequence.clear();
		// 这只WhiteHuman的执行顺序
		this.sequence.add("simle");
		this.sequence.add("say");
		// 按照顺序返回一个先会笑再会说的黑人
		this.blackHumanBuilder.setSequence(this.sequence);
		return (BlackHuman) this.blackHumanBuilder.getHumanModel();
	}
}
