package com.fun.utils;

import com.fun.frame.SourceCode;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

public class Join extends SourceCode {

    /**
     * 把字符串每个字符用分隔器连接起来
     *
     * @param text
     * @param separator
     * @return
     */
    public static String join(String text, String separator) {
        return StringUtils.join(ArrayUtils.toObject(text.toCharArray()), separator);
    }

    /**
     * 把字符串每个字符用分隔器连接起来
     *
     * @param text
     * @param separator
     * @return
     */
    public static String join(String text, String separator, String prefix, String suffix) {
        return prefix + join(text, separator) + suffix;
    }

    /**
     * 把Iterable用分隔器连接起来
     *
     * @param iterable
     * @param separator
     * @param prefix
     * @param suffix
     * @return
     */
    public static String join(Iterable<?> iterable, String separator, String prefix, String suffix) {
        return prefix + join(iterable, separator) + suffix;
//        return list.stream().map(x -> x.toString()).collect(Collectors.joining(separator, prefix, suffix)).toString();
    }

    /**
     * 把Iterable用分隔器连接起来，没有前后缀
     *
     * @param iterable
     * @param separator
     * @return
     */
    public static String join(Iterable<?> iterable, String separator) {
        return StringUtils.join(iterable, separator);
    }


    /**
     * 把数组添加用间隔符连接
     *
     * @param objects
     * @param separator
     * @param prefix    前缀
     * @param suffix    后缀
     * @return
     */
    public static String join(Object[] objects, String separator, String prefix, String suffix) {
        return prefix + join(objects, separator) + suffix;
    }

    /**
     * 把数组添加用间隔符连接
     *
     * @param objects
     * @param separator 间隔
     * @return
     */
    public static String join(Object[] objects, String separator) {
        return StringUtils.join(objects, separator);
    }


}
