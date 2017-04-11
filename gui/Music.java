package gui;

/**
 *
 * @author lucas.burdell
 */
public enum Music {
    LIVING_VOYAGE, THE_BUILDER, CORRUPTION;
    
    private static String[] fileNames = new String[]{"mus_living_voyage.mp3", 
            "mus_the_builder.mp3", "mus_corruption.mp3"};
    
    public String getFileName() {
        return fileNames[this.ordinal()];
    }
}
