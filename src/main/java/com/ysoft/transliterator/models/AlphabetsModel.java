package com.ysoft.transliterator.models;

import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;
import com.ysoft.transliterator.enumeration.EAlphabet;

public class AlphabetsModel {

	private String primaryAlphabet;
	private List<String> targetAlphabets;
	private String sourceAlphabet;
	private String targetAlphabet;
	
	public AlphabetsModel() {
		this("Latin", getTargetAlphabetNames());
	}
	
	public AlphabetsModel(String primaryAlphabet, List<String> targetAlphabets) {
		this.primaryAlphabet = primaryAlphabet;
		this.targetAlphabets = targetAlphabets;
	}
	
	public String getPrimaryAlphabet() {
		return primaryAlphabet;
	}

	public List<String> getTargetAlphabets() {
		return targetAlphabets;
	}

	public String getSourceAlphabet() {
		return sourceAlphabet;
	}

	public void setSourceAlphabet(String sourceAlphabet) {
		this.sourceAlphabet = sourceAlphabet;
	}

	public String getTargetAlphabet() {
		return targetAlphabet;
	}

	public void setTargetAlphabet(String targetAlphabet) {
		this.targetAlphabet = targetAlphabet;
	}

	private static List<String> getTargetAlphabetNames() {
		List<EAlphabet> alphabets = Lists.<EAlphabet>newArrayList(EAlphabet.values());
		return alphabets.stream().filter(a -> a != EAlphabet.LATIN).map(EAlphabet::getAlphabetName).collect(Collectors.toList());
	}
}
