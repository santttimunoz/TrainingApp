package gw.cmdline.util

uses gw.lang.cli.*

@ReadOnly
class MaintenanceToolsArgs {

  /**
   * The name of the process to start.
   */
  @ShortName( "startprocess" )
  static var _startProcess : String as StartProcess

  /**
   * A name or process number to return the process status of
   */
  @ShortName( "processstatus" )
  static var _processStatus : String as ProcessStatus

  /**
   * A name or process number to terminate
   */
  @ShortName( "terminateprocess" )
  static var _terminateProcess : String as TerminateProcess

  /**
   * The PublicID of the contact to change subtype for. Must also set -changesubtypetargettype
   */
  @ShortName( "changesubtypepublicid" )
  static var _changeSubtypePublicID : String as ChangeSubtypePublicID

  /**
   * The target type to change contact to. Must also set -changesubtypepublicid
   */
  @ShortName( "changesubtypetargettype" )
  static var _changeSubtypeTargetType : String as ChangeSubtypeTargetType

  /**
   * The root server URL to access
   */
  @DefaultValue( 
          "http://localhost:8280/ab" )
  static var _server : String as Server

  /**
   * The user to log in as
   */
  @DefaultValue( "su" )
  static var _user : String as User

  /**
   * The password to use
   */
  @DefaultValue( "gw" )
  static var _password : String as Password

}
