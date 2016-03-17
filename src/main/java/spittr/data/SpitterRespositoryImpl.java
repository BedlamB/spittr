package spittr.data;

import spittr.Spitter;

public class SpitterRespositoryImpl implements SpitterRepository {

    @Override
    public Spitter save(Spitter spitter) {
        return new Spitter();
    }
}
