package io.nikolamicic21.multiplehierarchicalcontexts.data;

import io.nikolamicic21.multiplehierarchicalcontexts.web.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DataService {

    private final WebService webService;

    public String getName() {
        return getClass().getSimpleName() + "#" + getClass().getMethods()[0].getName();
    }
}
