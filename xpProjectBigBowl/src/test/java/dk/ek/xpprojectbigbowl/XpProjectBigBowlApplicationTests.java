package dk.ek.xpprojectbigbowl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XpProjectBigBowlApplicationTests {


import { initPage } from './page';

    test("initPage triggers fetch on load", async () => {

        const mockFetch = jest.fn();

        await initPage(mockFetch);

        expect(mockFetch).toHaveBeenCalled();
    });

    @Test
    void contextLoads() {
    }

}

