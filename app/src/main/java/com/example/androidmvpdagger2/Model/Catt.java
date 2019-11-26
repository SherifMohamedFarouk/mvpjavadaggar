package com.example.androidmvpdagger2.Model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Catt {
@SerializedName("id")
@Expose
private String id;
@SerializedName("url")
@Expose
private String url;
@SerializedName("width")
@Expose
private Integer width;
@SerializedName("height")
@Expose
private Integer height;
@SerializedName("categories")
@Expose
private List<Category> categories = null;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public Integer getWidth() {
return width;
}

public void setWidth(Integer width) {
this.width = width;
}

public Integer getHeight() {
return height;
}

public void setHeight(Integer height) {
this.height = height;
}

public List<Category> getCategories() {
return categories;
}

public void setCategories(List<Category> categories) {
this.categories = categories;
}

}