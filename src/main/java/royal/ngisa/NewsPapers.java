package royal.ngisa;

import javafx.util.Builder;

import java.util.Objects;

public class NewsPapers {

    public int pageNum;
    public String title;

    public NewsPapers()
    {
    }

    public int getPageNum() {
        return pageNum;
    }

    public String getTitle() {
        return title;
    }

    public static class Builder{
        public int pageNum;
        public String title;

        public Builder pageNum(int k){
            this.pageNum = k;
            return this;
        }

        public Builder title(String k){
            this.title=k;
            return this;
        }
        public NewsPapers build()
        {
            return new NewsPapers(this);
        }
    }

    public NewsPapers(Builder builder)
    {
        this.pageNum=builder.pageNum;
        this.title=builder.title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsPapers page = (NewsPapers) o;
        return Objects.equals(getPageNum(),page.getPageNum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPageNum());
    }
}
