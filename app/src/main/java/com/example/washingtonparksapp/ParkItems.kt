package com.example.washingtonparksapp


import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ParkItems(
    var image: Int, var title: Int, var imageDetail: Int, var textDetail: Int
): Parcelable {

    companion object {
        var parkItemsList: ArrayList<ParkItems> = arrayListOf(
            ParkItems(R.drawable.ic_cloud, R.string.first_park, R.drawable.mount_rainier_np, R.string.mount_rainer_details),
            ParkItems(R.drawable.ic_sunny, R.string.second_park, R.drawable.olympic_np, R.string.olympic_details),
            ParkItems(R.drawable.ic_local_florist, R.string.third_park, R.drawable.north_cascdes_np, R.string.north_cascades_details),
            ParkItems(R.drawable.ic_terrain, R.string.fourth_park, R.drawable.deception_pass_state_park, R.string.deception_pass_details),
            ParkItems(R.drawable.ic_water, R.string.fifth_park, R.drawable.lake_wenatchee_np, R.string.lake_wenatchee_details),
            ParkItems(R.drawable.ic_sunny, R.string.sixth_park, R.drawable.palouse_falls_np, R.string.palouse_falls_details),
            ParkItems(R.drawable.ic_umbrella, R.string.seventh_park, R.drawable.lime_kiln_point_np, R.string.lime_kiln_points_details),
            ParkItems(R.drawable.ic_thunderstorm, R.string.eighth_park, R.drawable.larrabee_state_np, R.string.larrabee_details),
            ParkItems(R.drawable.ic_cloud, R.string.ninth_park, R.drawable.ginkgo_petrified_forest_state_park, R.string.ginkgo_petrified_details),
            ParkItems(R.drawable.ic_water, R.string.tenth_park, R.drawable.cape_disappointment_np, R.string.cape_disappointment_details),
            ParkItems(R.drawable.ic_terrain, R.string.eleventh_park, R.drawable.birch_bay_np, R.string.birch_bay_details),
            ParkItems(R.drawable.ic_local_florist, R.string.twelfth_park, R.drawable.manchester_state_park, R.string.manchester_details),
            ParkItems(R.drawable.ic_umbrella, R.string.thirteenth_park, R.drawable.sun_lakes_dry_falls_park, R.string.sun_lakes_dry_details)
        )
    }
}