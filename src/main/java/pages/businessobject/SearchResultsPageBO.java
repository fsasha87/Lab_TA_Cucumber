package pages.businessobject;

import pages.BucketPage;
import pages.MainPage;
import pages.SearchResultsPage;

public class SearchResultsPageBO {
    public SearchResultsPageBO typeCategory(String thing) {
        new MainPage()
                .typeSearchField(thing)
                .clickSearchField();
        return this;
    }
    public SearchResultsPageBO selectGoodByBrand(String brand){
        new SearchResultsPage()
                .enterBrandFieldAndClickCheckbox(brand);
        return this;
    }
    public SearchResultsPageBO throwTheCheapestToTheBucket(){
        new SearchResultsPage()
                .selectSortOption()
                .clickFirstElementButton();
        new BucketPage()
                .openBucket();
        return this;
    }

}
