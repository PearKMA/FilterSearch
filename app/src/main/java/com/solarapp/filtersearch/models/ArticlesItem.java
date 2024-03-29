package com.solarapp.filtersearch.models;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.solarapp.filtersearch.R;
import com.solarapp.filtersearch.utils.DateUtils;

public class ArticlesItem {
	private String publishedAt;
	private String author;
	private String urlToImage;
	private String description;
	private Source source;
	private String title;
	private String url;
	private String content;

	public void setPublishedAt(String publishedAt){
		this.publishedAt = publishedAt;
	}

	public String getPublishedAt(){
		return DateUtils.formatDate(publishedAt);
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}

	public void setUrlToImage(String urlToImage){
		this.urlToImage = urlToImage;
	}

	public String getUrlToImage(){
		return urlToImage;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setSource(Source source){
		this.source = source;
	}

	public Source getSource(){
		return source;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setContent(String content){
		this.content = content;
	}

	public String getContent(){
		return content;
	}

    @BindingAdapter("profileImage")
    public static void loadImage(ImageView view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .apply(new RequestOptions().centerCrop())
                .placeholder(R.drawable.ic_loading)
                .into(view);
    }

	@Override
 	public String toString(){
        return
                "ArticlesItem{" +
                        "publishedAt = '" + publishedAt + '\'' +
                        ",author = '" + author + '\'' +
                        ",urlToImage = '" + urlToImage + '\'' +
                        ",description = '" + description + '\'' +
                        ",source = '" + source + '\'' +
                        ",title = '" + title + '\'' +
                        ",url = '" + url + '\'' +
                        ",content = '" + content + '\'' +
			"}";
		}
}
