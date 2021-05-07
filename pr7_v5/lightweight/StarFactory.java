package pr7_v5.lightweight;

import java.util.HashMap;
import java.util.Map;

public class StarFactory {
    private final Map<SpectralType, Star> stars = new HashMap<>();

    @SuppressWarnings("UnusedReturnValue")
    public Star createStar(SpectralType spectralType) {
        if (stars.containsKey(spectralType)) {
            return stars.get(spectralType);
        } else {
            Star star = new Star().setSpectralType(spectralType);
            stars.put(spectralType, star);
            return star;
        }
    }
}
