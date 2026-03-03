import { initPage } from './page';

test("initPage triggers fetch on load", async () => {
    const mockFetch = jest.fn();
    await initPage(mockFetch);
    expect(mockFetch).toHaveBeenCalled();
});