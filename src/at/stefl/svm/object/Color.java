package at.stefl.svm.object;

public class Color {

    private final int rgba;

    public Color(int rgb) {
	this.rgba = 0xff000000 | rgb;
    }

    public Color(int red, int green, int blue) {
	this.rgba = 0xff000000 | ((red & 0xff) << 16) | ((green & 0xff) << 8)
		| ((blue & 0xff) << 0);
    }

    @Override
    public String toString() {
	return "[r=" + getRed() + ", g=" + getGreen() + ", b=" + getBlue()
		+ "]";
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null)
	    return false;
	if (obj == this)
	    return true;

	if (!(obj instanceof Color))
	    return false;

	return rgba == ((Color) obj).rgba;
    }

    @Override
    public int hashCode() {
	return rgba;
    }

    public int getRGBA() {
	return rgba;
    }

    public int getAlpha() {
	return (rgba >> 24) & 0xff;
    }

    public int getRed() {
	return (rgba >> 16) & 0xff;
    }

    public int getGreen() {
	return (rgba >> 8) & 0xff;
    }

    public int getBlue() {
	return (rgba >> 0) & 0xff;
    }

}