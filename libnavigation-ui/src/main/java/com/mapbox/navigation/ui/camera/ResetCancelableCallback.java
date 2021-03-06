package com.mapbox.navigation.ui.camera;

import com.mapbox.mapboxsdk.maps.MapboxMap;

class ResetCancelableCallback implements MapboxMap.CancelableCallback {

  private final NavigationCamera camera;

  ResetCancelableCallback(NavigationCamera camera) {
    this.camera = camera;
  }

  @Override
  public void onCancel() {
    camera.updateIsResetting(false);
  }

  @Override
  public void onFinish() {
    camera.updateIsResetting(false);
  }
}