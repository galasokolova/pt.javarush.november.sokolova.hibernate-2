package pt.javarush.entity;

import static java.util.Objects.isNull;

public enum SpecialFeature {
    TRAILERS("Trailers"),
    COMMENTARIES("Commentaries"),
    DELETED_SCENES("Deleted Scenes"),
    BEHIND_THE_SCENES("Behind the Scenes");

    private final String value;

    SpecialFeature(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public static SpecialFeature getFeatureByValue(String featureValue){
        if (isNull(featureValue) || featureValue.isEmpty()){
            return null;
        }
        SpecialFeature[] specialFeatures = SpecialFeature.values();

        for (SpecialFeature specialFeature : specialFeatures) {
            if (specialFeature.value.equals(featureValue)){
                return specialFeature;
            }
        }
        return null;
    }
}
