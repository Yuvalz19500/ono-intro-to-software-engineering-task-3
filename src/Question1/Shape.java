package Question1;

import Question3.Prototype;

public abstract class Shape implements Prototype {
    public abstract void draw();

    @Override
    public abstract Shape clone();
}
