package com.example.mara.tourguidezagreb;

/**
 * Created by Mara on 4.6.2017..
 */

public class Place {


    /**
     * Constant value that represents no image was provided for this place
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * String resource for the name of each category
     */
    private String mPlaceName;
    /**
     * String resource for the info of each category
     */
    private String mPlaceInfo;
    /**
     * Image resource ID for each category
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Place object./
     */
    public Place(String PlaceName, String PlaceInfo) {
        mPlaceName = PlaceName;
        mPlaceInfo = PlaceInfo;
    }

    /**
     * Create a new Place object./
     */
    public Place(String PlaceName, String PlaceInfo, int ImageResourceId) {
        mPlaceName = PlaceName;
        mPlaceInfo = PlaceInfo;
        mImageResourceId = ImageResourceId;
    }


    /**
     * Get the string resource ID for each category.
     */
    public String getPlaceName() {
        return mPlaceName;
    }

    /**
     * Get the string resource ID for each category.
     */
    public String getPlaceInfo() {
        return mPlaceInfo;
    }

    /**
     * Get the image resource ID for each category.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for each category.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
