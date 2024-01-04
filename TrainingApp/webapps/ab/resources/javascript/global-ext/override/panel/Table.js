Ext.define('Gw.override.panel.Table', {
  override: 'Ext.panel.Table',
  /**
   * PL-29294 Newly added LV column appears at the extreme right until layout preferences are reset
   * this happens like a reload after editing the PCF, the JSON items and the state will be out of sync
   * Hence do not try to restore state, need to override here to work in rowtree and grid
   */
  initComponent: function () {
    this.on('beforestaterestore', function (panel, state) {
      var i,
          hdrItems = panel.headerCt.items.items,
          hdrIds = [] ,
          stateIds = [];

      // If number of saved columns and configured columns are not the same
      // returns false since columsn are either deleted or added
      if (hdrItems.length !== state.columns.length) {
        return false;
      }

      // Same number of columns but the configured and saved columns are different
      for (i = 0; i < hdrItems.length; i++) {
        hdrIds.push(hdrItems[i].getStateId());
        stateIds.push(state.columns[i].id);
      }
      hdrIds.sort();
      stateIds.sort();
      if (hdrIds.join() !== stateIds.join()) {
        return false;
      }
    });

    this.callOverridden(arguments);
  }

});