package gw.plugin.contact.pendingchange

uses gw.api.bean.compare.EntityDiff
uses gw.api.bean.compare.ui.DiffDisplay

@Export
class ABContactContactDiffDisplay extends KeyableBeanDiffDisplay<ABContactContact>{

  private final var _diff : EntityDiff<ABContactContact>

  construct(theDiff : EntityDiff<ABContactContact>, theType : DiffDisplay.Type) {
    super(theDiff, theType)
    _diff = theDiff
  }

  override property get Label() : String {
    return _diff.CompareValue.Rel == null ? _diff.SourceValue.Rel.DisplayName : _diff.CompareValue.Rel.DisplayName
  }

  override property get OldValue() : String {
    var value = _diff.SourceValue.RelABContact
    return value == null ? "" : value.DisplayName
  }

  override property get NewValue() : String {
    var value = _diff.CompareValue.RelABContact
    return value == null ? "" : value.DisplayName
  }

}