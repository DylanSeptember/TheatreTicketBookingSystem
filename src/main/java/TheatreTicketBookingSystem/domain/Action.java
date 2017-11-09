package TheatreTicketBookingSystem.domain;

import TheatreTicketBookingSystem.domain.Intefaces.Movie;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Hasan on 10/31/2017.
 */
@Entity
public class Action implements Movie
{
    @Id
    @GeneratedValue
    private Long movie_id;
    private int duration;
    private String title;
    private String imagePath;

    public String getImagePath() { return imagePath; }
    public Long getMovie_Id()
    {
        return movie_id;
    }

    public int getDuration() {
        return duration;
    }

    public String getTitle() {
        return title;
    }

    public Action() { }

    public Action(Builder builder){
        this.movie_id = builder.movie_id;
        this.duration = builder.duration;
        this.title = builder.title;
        this.imagePath = builder.imagePath;
    }

    public static class Builder{

        private Long movie_id;
        private String title;
        private int duration;
        private String imagePath;

        public Builder imagePath(String imagePath) {
            this.imagePath = imagePath;
            return this;
        }

        public Builder movie_id(Long movie_id) {
            this.movie_id = movie_id;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder duration(int duration) {
            this.duration = duration;
            return this;
        }

        public Action build(){
            return  new Action(this);
        }
    }
}
