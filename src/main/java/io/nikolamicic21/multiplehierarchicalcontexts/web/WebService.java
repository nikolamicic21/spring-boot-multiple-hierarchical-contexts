package io.nikolamicic21.multiplehierarchicalcontexts.web;

import org.springframework.stereotype.Service;

@Service
public class WebService {

    public String getName() {
        return getClass().getSimpleName() + "#" + getClass().getMethods()[0].getName();
    }
}
