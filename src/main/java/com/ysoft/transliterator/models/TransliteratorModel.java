package com.ysoft.transliterator.models;

import java.util.List;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;
import com.ysoft.transliterator.enumeration.EAlphabet;

public class TransliteratorModel {

	private List<String> targetAlphabets;
	private String sourceAlphabet;
	private String targetAlphabet;
	private String sourceAlphabetString;
	private String targetAlphabetString;
	
	public TransliteratorModel() {
		this("Latin", getTargetAlphabetNames());
	}
	
	public TransliteratorModel(String sourceAlphabet, List<String> targetAlphabets) {
		this.sourceAlphabet = sourceAlphabet;
		this.targetAlphabets = targetAlphabets;
	}

	public List<String> getTargetAlphabets() {
		return targetAlphabets;
	}

	public String getSourceAlphabetString() {
		return sourceAlphabetString;
	}

	public void setSourceAlphabetString(String sourceAlphabetString) {
		this.sourceAlphabetString = sourceAlphabetString;
	}

	public String getTargetAlphabetString() {
		return targetAlphabetString;
	}

	public void setTargetAlphabetString(String targetAlphabetString) {
		this.targetAlphabetString = targetAlphabetString;
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
