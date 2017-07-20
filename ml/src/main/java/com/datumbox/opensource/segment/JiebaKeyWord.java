package com.datumbox.opensource.segment;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.SegToken;

import java.util.List;

/**
 * Created by kongming on 2017/7/20.
 */
public class JiebaKeyWord {


    static String[] sentences =
            new String[] {"����һ�����ֲ�����ָ�ĺ�ҹ���ҽ�����գ��Ұ��������Ұ�Python��C++��", "�Ҳ�ϲ���ձ��ͷ���", "�׺�ع��˼䡣",
                    "���Ŵ�Ů����ÿ�¾����������Ҷ�Ҫ�׿ڽ���24�ڽ������ȼ����������İ�װ����", "�����ĺ���δ������"};


    public static void main(String[] args) {

        JiebaSegmenter jiebaSegmenter = new JiebaSegmenter();

        for (String sentence : sentences) {
            List<String> segList = jiebaSegmenter.sentenceProcess(sentence);
            System.out.println("segList = " + segList);
            List<SegToken> tokenList = jiebaSegmenter.process(sentence, JiebaSegmenter.SegMode.INDEX);
            System.out.println("tokenList = " + tokenList);
        }




    }

}
