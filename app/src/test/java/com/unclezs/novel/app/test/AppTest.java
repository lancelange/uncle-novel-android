package com.unclezs.novel.app.test;

import com.unclezs.novel.analyzer.util.regex.RegexUtils;

import org.junit.Test;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

import javax.script.ScriptEngineManager;

/**
 * @author blog.unclezs.com
 * @date 2021/05/20 0:59
 */
public class AppTest {
    @Test
    public void testRegex() {
        String param = "keyword";
        String src = "完美时间欸";
        String script = RegexUtils.get("\\{\\{([^{]*?" + param + ".*?)\\}\\}", src, 1);
        System.out.println(script);
    }

    @Test
    public void testScript() {
        Context context = Context.enter();
        Scriptable scope = context.initStandardObjects();
    }
}
