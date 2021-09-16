package io.nikolamicic21.multiplehierarchicalcontexts.data;

import org.springframework.stereotype.Service;

@Service
public class DataService {

    public String getName() {
        return getClass().getSimpleName() + "#" + getClass().getMethods()[0].getName();
    }
}
