package io.nikolamicic21.multiplehierarchicalcontexts.web;

import io.nikolamicic21.multiplehierarchicalcontexts.data.DataService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WebService {

    private final DataService dataService;

    public String getName() {
        return getClass().getSimpleName() + "#" + getClass().getMethods()[0].getName();
    }
}
