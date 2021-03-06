package imit.taskThird;

public class BeginStringFilter implements Filter{
    private String pattern;

    public BeginStringFilter(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    @Override
    public boolean apply(String str) {
        return str.startsWith(pattern);
    }
}
