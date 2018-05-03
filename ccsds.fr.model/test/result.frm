<?xml version="1.0" encoding="UTF-8"?>
<fr:FunctionalResourceModel xmlns:fr="http://iso.org.dod.ccsds">
  <rootOid>
    <oidBit>1</oidBit>
    <oidBit>3</oidBit>
    <oidBit>112</oidBit>
    <oidBit>4</oidBit>
    <oidBit>4</oidBit>
    <oidBit>2</oidBit>
    <oidBit>1</oidBit>
  </rootOid>
  <functionalResource oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="Antenna">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>1</oidBit>
    </oid>
    <directives oidBit="1" authorizingEntity="Test" creationDate="2014-11-11T23:00:00.000+0100" name="Stow">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <parameter oidBit="1" authorizingEntity="Holger" name="Position" engineeringUnit="rad">
        <oid/>
        <semantic_definition>The position for stow in radiants.</semantic_definition>
        <type_definition>&lt;p>&#xD;
    TBD&#xD;
&lt;/p></type_definition>
      </parameter>
      <semantic_definition>TBD</semantic_definition>
    </directives>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-05-29T00:00:00.000+0200" name="antenna-id" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>&lt;p style=&quot;MARGIN-RIGHT: 0px&quot; align=&quot;left&quot;>&#xD;
    This &lt;strong>parameter&lt;/strong> identifies the&amp;nbsp;antenna that is &lt;em>involved&lt;/em> in providing a given support. So&#xD;
    far, these antenna identifiers are &lt;u>typically&lt;/u> defined by the operating agency so that no guarantee can be given&#xD;
    that the identifier is globally unique.&#xD;
&lt;/p>&#xD;
&lt;p style=&quot;MARGIN-RIGHT: 0px&quot; align=&quot;left&quot;>&#xD;
    &lt;em>Knowledge of which antenna is being used is needed for a number of aspects, e.g. to assess the observed signal&#xD;
    levels with respect to the antenna performance or to perform time correlation that requires knowledge of the exact&#xD;
    location of the given antenna. Note: In case the antennas used for uplink and downlink are not identical, the&#xD;
    Functional Resource &lt;sup>(FR)&lt;/sup> instance number shall be used to differentiate them. As concerns antenna arraying,&#xD;
    it is assumed that each array is associated with a name constituting a single functional resource.&lt;/em>&#xD;
&lt;/p></semantic_definition>
      <type_definition>&lt;font face=&quot;Courier New&quot;>SEQUENCE (SIZE (1)) OF VisibleString (SIZE(3..16))&lt;/font></type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="production-status" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the overall status of the antenna and can take on four values: &#xD;
- 'configured': the antenna system has been configured, but is not yet tracking because it is still moving to the initial pointing or the spacecraft is not yet or no longer in view; &#xD;
 - 'operational': the antenna is tracking in the reported pointing mode (cf. pointing-mode); &#xD;
 - 'interrupted': a failure has been detected that prevents the antenna from tracking nominally; &#xD;
 - 'halted': the antenna has been taken out of service, e.g. due to wind speed requiring the antenna to be put into stow position.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 3)&#xD;
{   configured   (0)&#xD;
,   operational   (1)&#xD;
,   interrupted   (2)&#xD;
,   halted   (3)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="actual-azimuth" engineeringUnit="1/1000 degree">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the current antenna azimuth pointing in 1/1000 degrees, where 0 degrees corresponds to pointing north and 90 degrees corresponds to pointing east. Depending on the way the antenna is built, values above 360 degrees may be reported in cases where the antenna enables such azimuth range as to mitigate the cable unwrap issue. For antennas with a mount different from elevation over azimuth (e.g. x/y mount), the antenna pointing shall be converted to the azimuth/elevation presentation. This also applies to antennas having a tilt mode as to overcome the zenith track singularity.&#xD;
Note: Time-tagged antenna pointing is regarded a radiometric product and therefore not part of monitoring. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 540000)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="actual-elevation" engineeringUnit="1/1000 degree">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the current antenna elevation pointing in 1/1000 degrees, where 0 degrees corresponds to pointing to the local horizon and 90 degrees corresponds to zenith pointing. Depending on the way the antenna is built, values above 90 degrees may be reported in cases where the antenna enables such elevation range as to mitigate the azimuth singularity at zenith. For antennas with a mount different from elevation over azimuth (e.g. x/y mount), the antenna pointing shall be converted to the azimuth/elevation presentation. This also applies to antennas having a tilt mode as to overcome the zenith track singularity.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 180000)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="commanded-azimuth" engineeringUnit="1/1000 degree">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the azimuth pointing in 1/1000 degrees commanded to the servo system, where 0 degrees corresponds to pointing north and 90 degrees corresponds to pointing east. Depending on the way the antenna is built, values above 360 degrees may be reported in cases where the antenna enables such azimuth range as to mitigate the cable unwrap issue. For antennas with a mount different from elevation over azimuth (e.g. x/y mount), the antenna pointing shall be converted to the azimuth/elevation presentation. This also applies to antennas having a tilt mode as to overcome the zenith track singularity.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0  .. 540000)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="commanded-elevation" engineeringUnit="1/1000 degree">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the antenna elevation pointing in 1/1000 degrees commanded to the servo system, where 0 degrees corresponds to pointing to the local horizon and 90 degrees corresponds to zenith pointing. Depending on the way the antenna is built, values above 90 degrees may be reported in cases where the antenna enables such elevation range as to mitigate the azimuth singularity at zenith. For antennas with a mount different from elevation over azimuth (e.g. x/y mount), the antenna pointing shall be converted to the azimuth/elevation presentation. This also applies to antennas having a tilt mode as to overcome the zenith track singularity.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 180000)</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="azimuth-error" engineeringUnit="1/1000 degree">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the difference in 1/1000 degrees between the actual and the predicted azimuth. Consequently this parameter will only be valid if pointing-mode = ('auto-track' OR 'conical scan'). Antennas not having or not being operated in any closed-loop tracking mode cannot provide this parameter and in this case the parameter shall be flagged as unavailable. &#xD;
Note: Time-tagged antenna pointing is regarded a radiometric product and therfore not part of monitoring.  </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0  .. 540000)</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="elevation-error" engineeringUnit="1/1000 degree">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the difference in 1/1000 degrees between the actual and the predicted elevation. Consequently this parameter will only be valid if pointing-mode = ('auto-track' OR  'conical scan'). Antennas not having or not being operated in any closed-loop tracking mode cannot provide this parameter and in this case the parameter shall be flagged as unavailable.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 180000)</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="pointing-mode" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the pointing mode of the antenna servo system. The values this parameter can take on are:&#xD;
- 'stow': the antenna is in or is moving to its stow position;&#xD;
- 'halt': the antenna has been stopped in its current position;&#xD;
- 'slew': the antenna is moving at commanded angular rates;&#xD;
- 'program-track': the antenna is pointed in accordance with spacecraft trajectory predicts;&#xD;
- 'conical scan': the antenna is performing a conical scan around the nominal pointing and applies offsets with respect to the predicts such that the observed signal strength is constant throughout the scan;&#xD;
- 'auto-track': the antenna pointing is driven by a tracking receiver that by means of a suitable feed (e.g. monopulse) determines an error signal both for azimuth and elevation.&#xD;
Antenna implementations will typically support only a subset of the above listed pointing modes.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 5)&#xD;
{   stow   (0)&#xD;
,   halt   (1)&#xD;
,   slew   (2)&#xD;
,   program-track   (3)&#xD;
,   conical-scan   (4)&#xD;
,   auto-track   (5)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="tracking-receiver-lock-status" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the lock status of the tracking receiver and as such is only supported by antennas that support and are configured to operate in 'auto-track' mode. The values the parameter may have are:&#xD;
- 'locked': the tracking receiver has locked on the return link signal and consequently is driving the antenna pointing;&#xD;
- 'not-locked': the tracking receiver is not locked on the return link signal and therefore cannot drive the antenna pointing. &#xD;
As a consequence, the pointing-mode will have changed to 'program-track' and won't return to 'auto-track' until tracking receiver lock is reacquired. If a tracking receiver is not available or not used, this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   locked   (0)
,   not-locked   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="tracking-receiver-mode" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the configuration of the tracking receiver and as such is only supported by antennas that support and are configured to operate in auto-track mode. The values the parameter may have are:&#xD;
- 'carrier tracking loop': the tracking receiver tracks the remnant carrier by means of a carrier tracking PLL;&#xD;
- 'cross-correlation-mode': the tracking receiver tracks the return link signal by means of checking for the spectral symmetry (e.g. in case of suppressed carrier modulation schemes).&#xD;
If a tracking receiver is not available or not used, this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   carrier-tracking-mode   (0)
,   cross-correlation-mode   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="tracking-receiver-input-level" engineeringUnit="1/10 dBm">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the return link signal level in tenth of dBm as observed by the tracking receiver, i.e., the signal level derived from the tracking receiver AGC reading. As to have comparable, i.e. station level plan independent, values the level reading should be calibrated to the LNA input. Due to the levels to be expected, the numbers will always be negative.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (-2000 .. -30)</type_definition>
    </parameter>
    <parameter oidBit="13" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="tracking-receiver-loop-bandwidth" engineeringUnit="1/10 Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the tracking receiver's dual-sided tracking loop bandwidth in tenth Hz.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 1000000)</type_definition>
    </parameter>
    <parameter oidBit="14" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="mean-wind-speed " engineeringUnit="1/10 m/s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the wind speed as observed close to the antenna. This parameter is measured in tenth m/s and averaged over the most recent minute.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 100)</type_definition>
    </parameter>
    <parameter oidBit="15" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="peak-wind-speed" engineeringUnit="1/10 m/s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the highest wind speed observed close to the antenna during the most recent 10 minutes. This parameter is measured in tenth m/s.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 100)</type_definition>
    </parameter>
    <parameter oidBit="16" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="wind-direction" engineeringUnit="degree">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the current wind direction in degrees, where 0 degrees corresponds to north and 90 degrees to east.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 359)</type_definition>
    </parameter>
    <parameter oidBit="17" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="accumulated-precipitation" engineeringUnit="mm">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the amount of precipitation in mm that accumulated since 0:00 UTC of the current day.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 100)</type_definition>
    </parameter>
    <parameter oidBit="18" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="precipitation-rate" engineeringUnit="mm/h">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>18</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the precipitation rate in mm/h as observed during the most recent hour.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 100)</type_definition>
    </parameter>
    <parameter oidBit="19" authorizingEntity="CSTS WG" creationDate="2015-05-30T00:00:00.000+0200" name="relative-humidity" engineeringUnit="%">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>19</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the relative humidity in % as observed by an outdoor meteorological sensor at the station. This parameter shall be flagged as invalid if the value from the Meteo unit is invalid and it shall be flagged as unavailable if this parameter is not available at this time.&#xD;
Note: Time-tagged meteo data (relative humidity, atmospheric pressure, temperature) is regarded a radiometric product and therefore not part of the monitoring data.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 100)</type_definition>
    </parameter>
    <parameter oidBit="20" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="atmospheric-pressure " engineeringUnit="hPa">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the atmospheric pressure in hPa as observed by an outdoor meteorological sensor at the station. This parameter shall be flagged as invalid if the value from the Meteo unit is invalid and it shall be flagged as unavailable if this parameter is not available at this time.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 100)</type_definition>
    </parameter>
    <parameter oidBit="21" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="temperature" engineeringUnit="°C">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>21</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the temperature in °C as observed by an outdoor meteorological sensor at the station. This parameter shall be flagged as invalid if the value from the Meteo unit is invalid and it shall be flagged as unavailable if this parameter is not available at this instant in time.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (-100 ..  100)</type_definition>
    </parameter>
    <semantic_definition>antenna tbd</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="Forward Space Link Carrier Transmission" uses="#//@functionalResource.0">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>2</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="production-status" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the Forward Space Link Carrier Transmission FR status and can take on four values:&#xD;
- 'configured': the forward link equipment has been configured, but the carrier has not been brought up or has been stopped;&#xD;
- 'operational': the forward link is active, i.e., the carrier is up;&#xD;
- 'interrupted': a failure has been detected, e.g. carrier still on outside the transmission mask, that resulted in the carrier being shut down;&#xD;
- 'halted': the forward link has been taken out of service, e.g. due to failed HPA cooling.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 3)&#xD;
{   configured   (0)&#xD;
,   operational   (1)&#xD;
,   interrupted   (2)&#xD;
,   halted   (3)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="carrier-signal" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the current state of the carrier radiation and can take on three values: - 'up': the&#xD;
carrier is &lt;em>&lt;strong>presently up and the signal&lt;/strong>&lt;/em> is radiated via the antenna; - 'test': the carrier is&#xD;
presently up and the signal is radiated into the water load; - 'down': the carrier is presently down, i.e. no signal is&#xD;
being radiated.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   up   (0)
,   test   (1)
,   down   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="eirp" engineeringUnit="dBW">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the current forward link signal level expressed as Equivalent Isotropically Radiated Power (EIRP) in dBW.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 150)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="forward-link-polarization" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the configured forward link polarization and can take on two values:&#xD;
- 'LCP': the carrier is radiated with left hand circular polarization;&#xD;
- 'RCP': the carrier is radiated in right hand circular polarization.&#xD;
Note: Polarization is defined from the point of view of the source, i.e., in the direction of the wave propagation.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   LHC   (0)
,   RHC   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="actual-transmit-frequency" engineeringUnit="Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the current forward link frequency in Hz. In general, the frequency will be constant, except during the forward link sweep and for Category B missions in case the forward link is being ramped as to compensate for the Doppler shift and rate on the forward link.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (2025000000 .. 40500000000)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="carrier-modulation" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the current state of the carrier modulation and can take on two values:&#xD;
- 'ON': the carrier is presently being modulated;&#xD;
- 'OFF': the carrier is presently not being modulated.&#xD;
Note: This parameter reports the modulation being off also when this is not explicitly commanded, e.g. when it is forced off automatically because the forward link sweep is active.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   ON   (0)
,   OFF   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="data-modulation-type" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports whether the symbol stream directly modulates the forward carrier or modulates a subcarrier that in turn modulates the forward carrier. It can take on two values:&#xD;
- 'direct': the carrier is directly modulated by the input data symbol stream;&#xD;
- 'subcarrier': the carrier modulating signal is the subcarrier generated by the Forward Space Link Subcarrier Transmission FR.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{  direct   (0)&#xD;
,   subcarrier   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="data-modulation-index" engineeringUnit="1/100 rad">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the configured peak modulation index for the telecommand signal in 1/100 radians. In case of suppressed carrier, this parameter shall report &quot;-1&quot;.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (0 .. 140, -1)</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="rng-modulation-index" engineeringUnit="1/100 rad">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the configured peak modulation index for the ranging signal in 1/100 radians.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 140)</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="sweep-procedure" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the current state of the carrier sweep and can take on two values:&#xD;
- 'active': the carrier is presently being swept;&#xD;
- 'not active': the carrier is presently not being swept, i.e. the nominal frequency is being radiated. &#xD;
Modulation shall be forced off, whenever the sweep is active. In case the forward link frequency is being changed as to compensate for Doppler shift and rate on the forward link (Category B missions only), this is not regarded to be a sweep.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   active   (0)
,   not-active   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="sweep-profile" engineeringUnit="Hz, Hz/s, s (see Semantic Definition for details)">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>&lt;p>&#xD;
    This &lt;strong>&lt;em>complex parameter&lt;/em>&lt;/strong> reports on the start frequency in Hz of the first leg of the&#xD;
    sweep&lt;br />&#xD;
&lt;/p>&#xD;
&lt;blockquote style=&quot;MARGIN-RIGHT: 0px&quot; dir=&quot;ltr&quot;>&#xD;
    &lt;p>&#xD;
        &lt;em>For each leg it then specifies the stop frequency in Hz, the sweep rate in Hz/s and the duration of the dwell&#xD;
        period in seconds (i.e., the time during which the carrier frequency is not changed) before the next leg is&#xD;
        started. The assumption is that there are no frequency discontinuities, i.e., the start frequency of a sweep leg is&#xD;
        always equal to the stop frequency of the previous leg.&lt;/em>&#xD;
    &lt;/p>&#xD;
&lt;/blockquote></semantic_definition>
      <type_definition>&lt;font face=&quot;Courier New&quot;>SEQUENCE OF IntUnsigned, where the first element specifies the start frequency of the first leg of&#xD;
the sweep profile and has a range of (2025000000 .. 40500000000). The remainder of the sequence consist of three elements&#xD;
for each leg of the sweep profile as follows: - stop frequency with a range of (2025000000 .. 40500000000); - sweep rate&#xD;
with a range of (1 .. 32000); - dwell time with a range of (0 .. 20).&lt;/font></type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="clcw-rf-lock" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the current spacecraft receiver carrier lock status as reported in the Communications Link Control Word (CLCW) in the telemetry as follows:&#xD;
- 'locked': the CLCW reports RF lock;&#xD;
- 'not locked': the CLCW reports no RF lock. &#xD;
This parameter can only be provided if:&#xD;
- the supported spacecraft telemetry contains the CLCW as per CCSDS 232.1-B-2;&#xD;
- the supporting provider processes the spacecraft telemetry and can analyze the CLCW.&#xD;
If the above conditions are not met, this parameter shall be flagged as unavailable.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   locked   (0)
,   not-locked   (1)
}</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="Forward Space Link Subcarrier Transmission">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="subcarrier-frequency" engineeringUnit="1/1000 Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the configured subcarrier frequency in 1/1000 Hz. As per CCSDS 401.0-B-21, only 8 kHz or 16 kHz are permissible. The fine resolution is specified here as to enable fine tuning of the subcarrier frequency in cases where this is necessary to compensate the forward link Doppler shift. In case that direct modulation is used, this parameter will report '0'.  &#xD;
Note: The specified range is intended to also cover the case of non-CCSDS missions. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned  (0 .. 300000000)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="subcarrier-modulation" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the subcarrier is currently being modulated and can take on two values:&#xD;
- 'ON': the subcarrier is currently being modulated;&#xD;
- 'OFF': the subcarrier is currently not being modulated.&#xD;
In case no subcarrier is used, this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   ON   (0)
,   OFF   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="subcarrier-frequency-to-data-clock-coherency" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the coherency between the subcarrier frequency and data clock is given in case a subcarrier&#xD;
is used. This parameter can take on 2 values:&#xD;
- 'YES': the subcarrier frequency is coherent with data clock;&#xD;
- 'NO': the subcarrier frequency is not coherent with data clock.&#xD;
In case no subcarrier is used, this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   yes   (0)
,   no   (1)
}</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="Forward Link Ranging">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>4</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="ranging-active" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the ranging system is active and can take on two values:&#xD;
- 'active': the ranging system is presently active, i.e., the ranging system is generating the ranging signal and modulating it on the forward link carrier;&#xD;
- 'not active': the ranging system is presently not active as far as the forward link is concerned, i.e., no ranging signal is modulated on the forward link carrier.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   active   (0)
,   not-active   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="ranging-type" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the type of ranging that is being used. It can take on the following values:&#xD;
- 'hybrid': the system performs range measurements in accordance with ECSS-E-50-02A;&#xD;
- 'pseudo noise': the system performs range measurements in accordance with CCSDS 414.1-B-1;&#xD;
- 'cdma': the system performs range measurements in accordance with CCSDS 415.1-B-1.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)&#xD;
{   hybrid   (0)&#xD;
,   pseudo-noise   (1)&#xD;
,   cdma   (2)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="tone-frequency-hybrid" engineeringUnit="Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the configured tone frequency in Hz, where the range is 100 kHz to 1.5 MHz. It is applicable only in case ranging-type = ‘hybrid’. If ranging-type ≠ 'hybrid', the value of this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (100000 .. 1500000)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="code-length-hybrid" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the configured length of the code that is modulating the ranging tone for resolving the range ambiguity. The code length range is 5 to 24. It determines the distance range within which ambiguity can be resolved.  It is applicable only in case the ranging-type = ‘hybrid’. If ranging-type ≠ 'hybrid', the value of this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (5 .. 24)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="chip-rate-pn" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the chip rate of the forward link ranging signal as a function of the forward link carrier frequency. The exact definition is given in CCSDS 414.1-B-1. This parameter is applicable only in case ranging-type = ‘pseudo noise’. If ranging-type ≠ 'pseudo noise', the value of this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (2) OF IntUnsigned&#xD;
where the first element reports the value of the parameter 'l' while the second element reports the value 'k' (see CCSDS 414.1-B-1 for the exact specification).&#xD;
l and k are integer values constrained by the following expression:&#xD;
(k=6 AND l = {1,2,…,12,16,32, OR 64}) OR (l=2 AND k= {8,9, OR 10}).</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="code-type-pn" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the PN ranging code type and modulating wave form and can take on the following values:&#xD;
- 'T2B sine': weighted-voting balanced Tausworthe T2B with sinusoidal range clock;&#xD;
- 'T2B square': weighted-voting balanced Tausworthe T2B with square wave range clock;&#xD;
- 'T4B sine': weighted-voting balanced Tausworthe T4B with sinusoidal range clock (only to be used in regenerative mode);&#xD;
- 'T4B square': weighted-voting balanced Tausworthe T4B with square wave range clock (only to be used in regenerative mode).&#xD;
If ranging-type ≠ 'pseudo noise', the value of this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned
{   t2B-sine   (0)
,   t2B-square   (1)
,   t4B-sine   (2)
,   t4B-square   (3)
}</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="code-cdma" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the PN code of the forward link ranging signal by indicating for each of the 18 stages of the shift register used to generate the code wether or not that stage has a feedback tap which by means of XOR combination of all these taps forms the input to stage 1 of the shift register. The number of these feedback taps is either 8 or 10 or 12. At the output of stage 18 the PN code forming the ranging signal is available. More details are provided in CCSDS 415.1-B-1. This parameter is applicable only in case ranging-type = ‘cdma’. If ranging-type ≠ 'cdma', the value of this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (18)) OF IntUnsigned (0 .. 1)&#xD;
{  noFeedackTap   (0)&#xD;
,   feedbackTap   (1)&#xD;
}</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="Forward Symbol Stream Transmission">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>5</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="data-clock" engineeringUnit="1/10000 Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the configured forward link symbol rate in 1/10000 Hz, where the range is 78125 to 2560000000.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (78125 .. 2560000000)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="baseband-waveform" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the baseband waveform used to modulate the subcarrier or carrier of the forward link. It can take on the following values:
- 'NRZ-L';
- 'NRZ-M';
- 'SP-L'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   nrz-l   (0)
,    nrz-m   (1)
,   sp-l   (2)
}</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="TC MC Multiplexing, Channel Synchronization and Encoding">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>6</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="physical-channel-name" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the name assigned to the forward physical channel. This name is a Visible String which has a length of 1 to 32 characters.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF VisibleString (1 ..32)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="maximum-cltu-length " engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the maximum length in octets of a CLTU the FR will forward to the Forward Symbol Stream Transmission FR. If the given FR instance is not configured to accept CLTUs as incoming service data units, the value of this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (12 .. 4096)&#xD;
</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="randomizer" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the FR randomizes incoming MC TC frames prior to converting them to CLTUs. This parameter can take on two values:&#xD;
- 'not used';&#xD;
- 'used'.&#xD;
The details regarding the randomization are specified in CCSDS 231.0-B-2.  If the given FR instance is not configured to accept MC TC frames as incoming service data unit, the value of this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   notUsed   (0)&#xD;
,   used   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="maximum-cltu-repetitions" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports how many times a given CLTU may at most be repeated on the forward link. The value of this parameter must be '1' if max-number-of-frames-per-cltu is ≠ 1. If the given instance of the FR is not configured to accept MC TC frames as incoming service data unit, the value of this parameter shall be flagged as 'undefined'.&#xD;
Note: If max-cltu-repetions = 1, the repeated transmissions options is either disabled or not supported.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 5)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="physical-layer-operations-procedure" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the Physical Layer Operation Procedure (PLOP) that the TC MC Multiplexing, Channel Synchronization and Encoding Encoding FR applies. This parameter can take on two values:&#xD;

- 'plop1';&#xD;

- 'plop2'.
&#xD;
The exact behavior of the FR as determined by the selected PLOP in effect is further described in the F-CLTU specification CCSDS 912.1-B-3.&#xD;
</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;

{   plop1   (0)&#xD;

,   plop2   (1)&#xD;

}&#xD;
</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2016-06-16T00:00:00.000+0200" name="acquisition-sequence-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the size, in octets, of the bit pattern to be radiated to enable the spacecraft telecommand system to achieve bit lock. The radiation of the acquisition sequence will be performed in accordance with the applicable Physical Layer Operations Procedure (PLOP) - cf. physical-layer-operations-procedure.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 255)</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="minimum-delay-time" engineeringUnit="1/1000000 s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the minimum time, in microseconds, that the FR instance will ensure between the completion of the radiation of one CLTU and the beginning of the radiation of the following CLTU. The exact effect of the delay time depending on the PLOP is further described in the F-CLTU specification CCSDS 912.1-B-3.&#xD;
</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Duration [2]&#xD;
</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="plop1-idle-sequence-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the length, in octets, of the idle sequence that shall be radiated after radiation of the acquisition sequence and whenever the radiation of a CLTU completed, provided physical-layer-operations-procedure = 'plop1'. If the parameter value is zero, no idle sequence is applied.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned  (0 .. 255)</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="forward-link-status" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the status of the forward link as it can be derived from the Communication Link Control Word (CLCW) in the associated telemetry stream. It can take on the following values:&#xD;
- 'forward link status not available': no CLCWs from the spacecraft have been received by the service provider;&#xD;
- 'no rf available': the service provider has received at least one CLCW; in the last CLCW received by the service provider, the bit that flags ‘No RF Available’ was set to ‘1’;&#xD;
- 'no bit lock': the service provider has received at least one CLCW; in the last CLCW received by the service provider, the bit that flags ‘No RF Available’ was set to ‘0’, and the bit that flags ‘No Bit Lock’ was set to ‘1;&#xD;
- 'nominal': the provider has received at least one CLCW; in the last CLCW received by the provider, the bit that flags ‘No RF Available’ was set to ‘0’, and the bit that flags ‘No Bit Lock’ was set to ‘0’.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 3)&#xD;
{   forward-link-status-not-available   (0)&#xD;
,   no-rf-available   (1)&#xD;
,   no-bit-lock   (2)&#xD;
,   nominal   (3)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="clcw-physical-channel" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the name assigned to the physical channel carrying the CLCW. This name is a Visible String which has a length of 1 to 32 characters.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF VisibleString (1 ..32)</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" creationDate="2014-06-14T00:00:00.000+0200" name="clcw-global-vcid" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the Master or Virtual Channel that carries the CLCW to be used by the F-CLTU service provider to determine the forward link RF and/or bit lock status. The parameter is the concatenation of the CCSDS assigned Spacecraft Identifier (SCID), the Transfer Frame Version Number (TFVN) and, if applicable, the Virtual Channel Identifier (VCID). The range of the Spacecraft Identifier and the Virtual Channel Identifier depend on the TFVN as follows:&#xD;
- TFVN = 0 (version 1) - SCID = (0 .. 1023), VCID = (0 .. 7);&#xD;
- TFVN = 1 (version 2) - SCID = (0 .. 255), VCID = (0 .. 63).</semantic_definition>
      <type_definition>SEQUENCE (SIZE (3)) OF IntUnsigned, where &#xD;
the first element is the SCID (0 .. 1023), &#xD;
the second element is the TFVN (0 .. 1); and &#xD;
the third element is the VCID (0 .. 63).&#xD;
As to have a way for expressing also the selection of the Master Channel, the 'special' VCID value 99 is used to indicate that the VCID may have any value. Therefore the exact range specification is:&#xD;
VCID ϵ {0 .. 63,99}    </type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="maximum-tc-frame-length " engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the maximum length in octets of a TC MC frame the FR accepts for further processing. The reported length refers to the frame length after insertion of the Frame Error Control Field if applicable. If the FR instance is not configured to accept TC MC frames as incoming service data units, the value of this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 1024)</type_definition>
    </parameter>
    <parameter oidBit="13" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="valid-scids" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the Spacecraft IDs and consequently the Master Channels that are permitted on the given forward link.  If the given FR instance is not configured to accept TC MC frames as incoming service data units, the value of this parameter shall be flagged as 'undefined'.&#xD;
</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 1024) OF IntUnsigned (0 .. 1023)&#xD;
</type_definition>
    </parameter>
    <parameter oidBit="14" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="mc-multiplexing-scheme" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the scheme that the FR applies to multiplex, if applicable, the Master Channels on the forward link. It can take on the following values:&#xD;
- 'fifo': the multiplexing is performed such that the TC MC Frames queued for the different Master Channels are multiplexed on the physical channel in the same sequence as they were received on the FR input;&#xD;&#xD;
- 'absolute priority': TC MC Frames are multiplexed in the order of priority given to the Master Channel for which they have been queued where all priorities have to be different;&#xD;&#xD;
- 'polling vector': the TC MC Frame queues of the Master Channels are checked for TC MC Frames ready to be multiplexed on the physical channel according to the polling vector.&#xD;
 If tc-input-type = 'cltu', the value of this parameter shall be flagged as 'undefined'.&#xD;&#xD;
</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)&#xD;

{   fifo   (0)
&#xD;
,   absolute priority   (1)&#xD;

,   polling vector   (2)&#xD;

}&#xD;
</type_definition>
    </parameter>
    <parameter oidBit="15" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="mc-multiplexing-control" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on how the Master Channels are multiplexed on the physical channel. In case mc-multiplexing-scheme =  ‘fifo’, this parameter will be flagged as undefined. If mc-multiplexing-scheme = 'absolute priority', then this parameter contains a sequence of the SCIDs used on the forward link where the first SCID in the sequence has the highest priority, the second has the second-highest priority etc. Consequently the sequence has as many elements as Spacecraft Identifiers are permitted on the given physical channel. If mc-multiplexing-scheme = 'polling vector', then the sequence consists of up to 3072 elements where each element is a SCID. Each SCID used in mc-multiplexing-control must be an element of permitted-scids.&#xD;
 If the given FR instance is not configured to accept TC MC frames as incoming service data units, the value of this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 3072) OF IntUnsigned (0 .. 1023)</type_definition>
    </parameter>
    <parameter oidBit="16" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="presence-of-frame-error-control" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the FR inserts the Frame Error Control Field into each frame before generating the corresponding CLTUs. This parameter can take on two values:&#xD;
- 'present';&#xD;
- 'absent'.&#xD;
The details regarding the FEC are specified in CCSDS 232.0-B-2.  If the given FR instance is not configured to accept TC MC frames as incomong service data units, the value of this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{  present   (0)&#xD;
,   absent   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="17" authorizingEntity="CSTS WG" creationDate="2014-05-30T00:00:00.000+0200" name="max-number-of-frames-per-cltu" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the maximum number of TC MC frames that may be converted into a single CLTU. The value of this parameter must be '1' if  max-number-of-cltu-repetitions ≠ 1. If the given FR instance is not configured to accept TC MC frames as incoming service data unit, the value of this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 15)</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="AOS MC Multiplexing, Channel Synchronization and Encoding">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>7</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="physical-channel-name" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the name assigned to the forward physical channel. This name is a Visible String which has a length of 1 to 32 characters.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF VisibleString (1 ..32)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="transfer-frame-length " engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the length in octets of a frame the FR accepts for further processing. The reported length refers to the frame length after insertion of the Header Error Control Field, Insert Zone and/or the Frame Error Control Field as applicable.&#xD;
If the FR instance is not configured to accept MC frames as incoming service data units, the value of this parameter shall be flagged as 'undefined'.&#xD;
Note: The permissible frame length is constrained by the applied encoding as specified in CCSDS 131.0-B-2.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (6 .. 2048)</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="valid-scids" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the Spacecraft IDs and consequently the Master Channels that are permitted on the given physical channel.  If the given FR instance is not configured to accept MC frames as incoming service data units, the value of this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 256) OF IntUnsigned (0 .. 255)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="mc-multiplexing-scheme" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the scheme that the FR applies to multiplex if applicable the Master Channels on the physical channel. It can take on the following values:&#xD;
- 'fifo': the multiplexing is performed such that the MC Frames queued for the different Master Channels are multiplexed on the physical channel in the same sequence as they are received on the FR input;&#xD;
- 'absolute priority': the MC Frames are multiplexed in the order of priority given to the Master Channel for which they have been queued where all priorities have to be different;&#xD;
- 'polling vector': the MC Frame queues of the Master Channels are checked for MC Frames ready to be multiplexed on the physical channel according to a polling vector.&#xD;
 If the given FR instance is not configured to accept MC frames as incoming service data units, the value of this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)&#xD;
{   fifo   (0)&#xD;
,   absolute priority   (1)&#xD;
,   polling vector   (2)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="mc-multiplexing-control" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on how the Master Channels are multiplexed on the physical channel. In case mc-multiplexing-scheme = ‘fifo’, this parameter will be flagged as undefined. If mc-multiplexing-scheme = 'absolute priority', then this parameter contains a sequence of the SCIDs used on the physical channel where the first SCID in the sequence has the highest priority, the second has the second-highest priority etc. Consequently the sequence has as many elements as Spacecraft Identifiers are permitted on the physical channel. If mc-multiplexing-scheme = 'polling vector', then the sequence consists of up to 768 elements where each element is an SCID. Each SCID used in mc-multiplexing-control must be an element of valid-scids.&#xD;
 If the given FR instance is not configured to accept, the value of this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 768) OF IntUnsigned (0 .. 255)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="presence-of-frame-header-error-control" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the FR inserts the Header Error Control Field into each frame before generating the corresponding CADU. This parameter can take on two values:&#xD;
- 'present';&#xD;
- 'absent'.&#xD;
The details regarding the Header Frame Error Control Field are specified in CCSDS 732.0-B-2.  If the FR instance is not configured to accept MC Frames as incoming service data unit, the value of this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   present   (0)&#xD;
,   absent   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="insert-zone-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the length in octets of the Insert Zone which will be inserted into each frame before generating the corresponding CADU. If insert-zone-length = 0, then the Insert Zone is absent. If the FR instance is not configured to accept MC Frames as incoming service data units, the value of this parameter shall be flagged as 'undefined'.&#xD;
</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2040)&#xD;
</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="presence-of-frame-error-control" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the FR inserts the Frame Error Control Field into each frame before generating the corresponding CADU. This parameter can take on two values:&#xD;&#xD;
- 'present';&#xD;
- 'absent'.&#xD;
The details regarding the FEC are specified in CCSDS 732.0-B-2.  If the FR instance is not configured to accept MC Frames as incoming service data units, the value of this parameter shall be flagged as 'undefined'.&#xD;&#xD;
</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   present   (0)&#xD;
,   absent   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="randomization" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the FR randomizes the MC frames prior to converting them to CADUs. This parameter can take on two values:&#xD;
- 'randomization';&#xD;
- 'no randomization'.&#xD;
The details regarding the randomization are specified in CCSDS 131.0-B-2.  If the FR instance is not configued to accept MC Frames as incoming service data units, the value of this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   randomization   (0)&#xD;
,   noRandomization   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="frame-encoding" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the encoding of the MC frames required to generate the CADU. This parameter can take on the following values:&#xD;
- 'uncoded';&#xD;
- 'convolutional';&#xD;
- 'reedSolomon';&#xD;
- 'concatenated';&#xD;
- 'turbo';&#xD;
- 'ldpc'.&#xD;
If the FR instance is not configured to accept MC Frames as incoming service data units, the value of this parameter shall be flagged as 'undefined'.&#xD;
Note: The length and pattern of the ASM is determined by the applicable encoding.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 5)&#xD;
{  uncoded    (0)&#xD;
,   convolutional    (1)&#xD;
,   reedSolomon    (2)&#xD;
,   concatenated    (3)&#xD;
,   turbo    (4)&#xD;
,   ldpc    (5)&#xD;
}&#xD;
</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="convolutional-code-rate" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the convolutional encoding of the frame. The convolutional encoding is applied to the ASM and the uncoded or Reed-Solomon encoded frame. This parameter can take on the following values:&#xD;
- '1/2';&#xD;
- '2/3';&#xD;
- '3/4';&#xD;
- '5/6';&#xD;
- '7/8'.&#xD;
If ((incoming service data unit NOT MC Frame) OR (frame-encoding = 'reedSolomon') OR (frame-encoding = 'turbo') OR (frame-encoding = 'ldpc')), the value of this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 4)&#xD;
{  1/2    (0)&#xD;
,  2/3    (1)&#xD;
,   3/4    (2)&#xD;
,   5/6    (3)&#xD;
,   7/8    (4)&#xD;
}&#xD;
</type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="rs-error-correction-capability" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the correction capability of the applied Reed-Solomon code. It can take on the following values:&#xD;
- '8';&#xD;
- '16'.&#xD;
If ((incoming service data unit NOT MC Frame) OR NOT ((frame-encoding = 'reedSolomon') OR (frame-encoding = 'concatenated'))), the value of this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{  8    (0)&#xD;
,  16    (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="13" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="rs-interleaving-depth" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>'This enumerated parameter reports on the interleaving depth of the applied Reed-Solomon encoding. It can take on the following values:&#xD;
- '1';&#xD;
- '2';&#xD;
- '3';&#xD;
- '4';&#xD;
- '5';&#xD;
- '8'.&#xD;
If ((incoming service data unit NOT MC Frame) OR NOT ((frame-encoding = 'reedSolomon') OR (frame-encoding = 'concatenated'))), the value of this parameter shall be flagged as 'undefined'.&#xD;
Note: If and how much virtual fill needs to be inserted is determined based on the values of transfer-frame-length and rs-interleaving-depth.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 5)&#xD;
{  1    (0)&#xD;
,  2    (1)&#xD;
,   3    (2)&#xD;
,  4     (3)&#xD;
,   5    (4)&#xD;
,   8    (5)&#xD;
}&#xD;
</type_definition>
    </parameter>
    <parameter oidBit="14" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="turbo-code-rate" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the coding rate of the applied turbo encoding. This parameter can take on the following values:&#xD;
- '1/2';&#xD;
- '1/3';&#xD;
- '1/4';&#xD;
- '1/6'.&#xD;
If ((incoming service data unit NOT MC Frame) OR (frame-encoding ≠ 'turbo')), the value of this parameter shall be flagged as 'undefined'.&#xD;
Note: The information block length is determined by the value of aos-fwd-frame-length.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 3)&#xD;
{  1/2    (0)&#xD;
,  1/3    (1)&#xD;
,   1/4    (2)&#xD;
,  1/6     (3)&#xD;
}&#xD;
</type_definition>
    </parameter>
    <parameter oidBit="15" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="ldpc-code-rate">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the coding rate of the applied ldpc encoding. This parameter can take on the following values:&#xD;
- '1/2';&#xD;
- '2/3';&#xD;
- '3/4';&#xD;
- '7/8'.&#xD;
If ((incoming service data unit NOT MC Frame) OR (frame-encoding ≠ 'ldpc')), the value of this parameter shall be flagged as 'undefined'.&#xD;
Note: The information block length is determined by the value of transfer-frame-length.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 3)&#xD;
{  1/2    (0)&#xD;
,  2/3    (1)&#xD;
,  3/4    (2)&#xD;
,  7/8    (3)&#xD;
}&#xD;
</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="TC VC Multiplexing">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>8</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="maximum-transfer-frame-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the maximum TC frame length in octets that is permitted on the given Master Channel, where the specified length must take into account the Frame Error Control Field, if present on the given physical channel.&#xD;
Note: The value of the maximum-transfer-frame-length parameter of an instance of this FR must be lessthan or equal to the parameter maximum-transfer-frame-length of the TC MC Multiplexing, Channel Synchronization and Encoding FR consuming the TC MC frames generated by this TC VC Multiplexing FR instance.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 1024)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="master-channel" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the spacecraft ID of the Master Channel that is generated by the given FR instance. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1023)</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="valid-vcids" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the VC-IDs that are permitted on the MC generated by the given FR instance.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 64) OF IntUnsigned (0 .. 63)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="vc-multiplexing-scheme" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the VC multiplexing scheme that the given FR instance applies to multiplex the virtual channels on the Master Channel. It can take on the following values:&#xD;
- 'fifo': the multiplexing is performed such that the TC VC frames queued for the different Virtual Channels are inserted into the Master Channel in the same sequence as they get queued by the FRs generating these frames;&#xD;
- 'absolute priority': TC VC frames are multiplexed in the order of priority given to the Virtual Channel for which they have been queued where all priorities have to be different;&#xD;
- 'polling vector': the TC VC fame queues of the Virtual Channels are checked for TC VC fames ready to be inserted in the Master Channel according to the polling vector.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)&#xD;
{   fifo   (0)&#xD;
,   absolutePriority   (1)&#xD;
,   pollingVector   (2)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="vc-multiplexing-control" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on how the Virtual Channels are multiplexed on the Master Channel. In case vc-multiplexing-scheme = ‘fifo’, this parameter will be flagged as undefined. If vc-multiplexing-scheme = 'absolute priority', then this parameter contains a sequence of the VCIDs used on the given Master Channel where the first VCID in the sequence has the highest priority, the second has the second-highest priority etc. Consequently the sequence has as many elements as Virtual Channels exist on the Master Channel generated by the given FR instance. If vc-multiplexing-scheme = 'polling vector', then the sequence consists of up to 192 elements where each element is a VCID. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 192) OF IntUnsigned (0 .. 63)</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-06-03T00:00:00.000+0200" name="TC Encapsulation, VC Packet Processing and VC Generation">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>9</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-03T00:00:00.000+0200" name="maximum-transfer-frame-length" engineeringUnit="Octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the maximum transfer frame length in octets that is permitted on the given Virtual Channel, where the specified length must take into account the Frame Error Control Field, if present on the given physical channel.&#xD;
Note: The value of the maximum-transfer-frame-length parameter of an instance of this FR must be less than or equal to the parameter maximum-transfer-frame-length of the TC VC Multiplexing FR consuming the TC VC generated by this TC Encapsulation, VC Packet Processing and VC Generation FR instance.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 1024)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="master-channel" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the SCID and consequently the Master Channel into which the TC VC frames generated by this FR instance shall be multiplexed.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1023)</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-03T00:00:00.000+0200" name="virtual-channel" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the VCID of the TC VC Frames the given FR instance generates.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 63)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="max-packet-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the maximum length in octets that a packet contained in an incoming VCP or ENCAP request may have. The FR will disregard requests containing packets that exceed this limit. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (6 .. 65537)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-03T00:00:00.000+0200" name="presence-of-segment-header" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if on the TC VC Frames generated by the given FR instance the segment header is present or absent. It can take on two values:&#xD;
- 'present';&#xD;
- 'absent'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{  present   (0)&#xD;
,   absent   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-03T00:00:00.000+0200" name="data-field-content" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the content of the data field of the VC TC Frames generated by the given instance of the FR. It can take on two values:&#xD;
- 'packets';&#xD;
- 'virtual channel access service data unit'.&#xD;
If presence-of-segment-header = present, this parameter shall be flagged as 'undefined'.&#xD;
Note: This parameter is specified only for the sake of completeness. Currently we do not have any FR instance that would consume virtual channel access service data units. We could drop it.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{  packets   (0)&#xD;
,   vca_sdu   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-03T00:00:00.000+0200" name="valid-packet-version-numbers" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This  parameter reports on the Packet Version Numbers of packets that the FR may insert into the TC VC frames.&#xD;
If data-field-content = 'virtual channel access service data unit', this parameter shall be flagged as 'undefined'.&#xD;
Note: If '1' is not an element of the set of supported Packet Version Numbers, then incoming VCP requests are disregarded by the FR. If 8 is not part of the supported Packet Version Numbers, then incoming ENCAP requests are disregarded. If both versions are allowed, then the data insertion is performed in the same sequence as the requests are received by the FR. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 2) OF IntUnsigned ({1,8})</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-03T00:00:00.000+0200" name="encap-min-data-unit-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the minimum length in octets that the data unit argument of an incoming ENCAP request must have. If an incoming request does not meet this requirement, that request will be disregarded by the FR.&#xD;
If ((8 NOT ELEMENT OF valid-packet-version-numbers) OR (data-field-content = 'virtual channel access service data unit')), this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 4294967287)</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-06-03T00:00:00.000+0200" name="encap-max-data-unit-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the maximum length in octets that the data unit argument of an incoming ENCAP request may have. If an incoming request does not meet this requirement, that request will be disregarded by the FR.&#xD;
If ((8 NOT ELEMENT OF valid-packet-version-numbers) OR data-field-content = 'virtual channel access service data unit')), this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 4294967287)</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" creationDate="2014-06-03T00:00:00.000+0200" name="valid-protocol-ids" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the set of protocol IDs of which an incoming encap request must contain one to be valid. The FR disregards incoming encap requests that are not valid.&#xD;
If (8 NOT ELEMENT OF valid-packet-version-numbers) OR data-field-content = 'virtual channel access service data unit'), this parameter shall be flagged as 'undefined'.  </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 8) OF IntUnsigned (0 .. 7)</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" creationDate="2014-06-03T00:00:00.000+0200" name="valid-protocol-id-extensions" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the set of protocol ID extensions of which an encap request must contain one to be valid if the protocol ID of that request is 6. The FR disregards incoming encap requests that are not valid.&#xD;
If ((8 NOT ELEMENT OF valid-packet-version-numbers) OR (data-field-content = 'virtual channel access service data unit') OR (6 NOT ELEMENT OF valid-protocol-ids)), this parameter shall be flagged as 'undefined'.  </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 16) OF IntUnsigned (0 .. 15)</type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="blocking" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies if on the given Virtual Channel the aggregation (blocking) of packets in a common TC VC frame is permitted. It can take on two values:&#xD;
- 'permitted';&#xD;
- 'prohibited'.&#xD;
Note: If blocking = 'prohibited', the permission of blocking in an incoming VCP request is disregarded by this FR. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;

{   permitted   (0)&#xD;

,   prohibited   (1)&#xD;

}&#xD;
</type_definition>
    </parameter>
    <parameter oidBit="13" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="blocking-timeout-period" engineeringUnit="1/1000 s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the period in 1/1000 seconds from inserting a first Space Packet into a Frame Data Unit until this unit is passed to the FOP regardless of the number of Packets contained; this timeout period is applicable to all blocking performed for the given VC. The parameter shall be flagged as undefined in case blocking = 'prohibited'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Duration [1] (100 .. 100000)</type_definition>
    </parameter>
    <parameter oidBit="14" authorizingEntity="CSTS" creationDate="2014-06-16T00:00:00.000+0200" name="type-a-repetitions" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports how many times a CLTU containing a TC Frame containing a Type-A service data unit of the given Virtual Channel shall be repeated.&#xD;
Note: This parameter must be equal or less than the parameter maximum-cltu-repetitions of the TC MC Multiplexing, Channel Synchronization and Encoding FR instance generating the physical channel used to transfer the given Virtual Channel. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 5)</type_definition>
    </parameter>
    <parameter oidBit="15" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="cop-control-repetions" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports how many times a CLTU containing a transfer frame containing a COP control service data unit on the given Virtual Channel shall be repeated.&#xD;
Note: This parameter must be equal or less than the parameter maximum-cltu-repetitions of the TC MC Multiplexing, Channel Synchronization and Encoding FR instance generating the physical channel used to transfer the given Virtual Channel. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 5)</type_definition>
    </parameter>
    <parameter oidBit="16" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="t1-initial" engineeringUnit="1/1000000 s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the time, in microseconds, from the transmission of a TC transfer frame in AD mode, as long as not acknowledged by an incoming CLCW, until this frame will be retransmitted or after the last permitted retransmission has happened (cf. transmission-limit), the FOP alert or AD mode suspension will occur.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Duration [2]</type_definition>
    </parameter>
    <parameter oidBit="17" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="transmission-limit" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the maximum number of times the first TC frame on the FOP Sent_Queue may be transmitted.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 255)</type_definition>
    </parameter>
    <parameter oidBit="18" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="fop-sliding-window-width" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>18</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the number of TC frames that may be transmitted on the given VC before an acknowledgement in the CLCW is required.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 255)</type_definition>
    </parameter>
    <parameter oidBit="19" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="timeout-type" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>19</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports how the FR instance shall act in case the transmission in AD mode of a TC frame is considered failed because the permitted number of TC frame retransmissions has been exhausted (cf. transmission-limit) and the permitted time from the moment when the last radiation has occurred until the frame should have been acknowledged by a CLCW (cf. t1-initial) has expired. The FOP offers two options which are reflected in the two values that this parameter can take on:&#xD;
-'alert': the AD mode is terminated and a FOP alert is generated;&#xD;
- 'suspend': the AD mode is suspended and may be resumed at a later point by invoking the dedicated directive.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)   &#xD;
{   alert   (0)&#xD;
,   suspend   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="20" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="fop-state" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the present state of the Frame Operation Procedure (FOP) as specified in CCSDS 232.1-B-2. The parameter can take on the following values:&#xD;
- 'active';&#xD;
- 'retransmit without wait';&#xD;
- 'retransmit with wait';&#xD;
- 'initializing without BC frame';&#xD;
- 'initializing with BC frame';&#xD;
- 'initial'.&#xD;
The FOP state table is explained in details in the CCSDS Communications Operation Procedure-1, CCSDS 232.1-B-2</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 5)&#xD;
{   active   (0)&#xD;
,   retransmit-without-wait   (1)&#xD;
,   retransmit-with-wait   (2)&#xD;
,   initializing-without-bc-frame   (3)&#xD;
,   initializing-with-bc-frame   (4)&#xD;
,   initial   (5)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="21" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="transmitter-frame-sequence-number" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
        <oidBit>21</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the value of the Frame Sequence Number, N(S), to be put in the Transfer Frame Primary Header of the next Type-AD frame to be transmitted after (re-)initialization of the AD service. This value will be equal to Transmitter_Frame_Sequence_Number, V(S).</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 255)</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="10" authorizingEntity="CSS Area" name="Encapsulation, MAP Packet Processing and MAP Multiplexing">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>10</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="maximum-transfer-frame-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the maximum transfer frame length in octets that is permitted on the given MAP Channel, where the specified length must take into account the Frame Error Control Field, if present on the given physical channel.&#xD;
Note: The value of the maximum-transfer-frame-length parameter of an instance of this FR must be less than or equal to the parameter maximum-transfer-frame-length of the TC Encapsulation, VC Packet Processing and VC Generation FR consuming the MAP channel generated by this Encapsulation, MAP Packet Processing and MAP Multiplexing FR instance.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 1024)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="valid-packet-version-numbers" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This  parameter reports on the Packet Version Numbers of packets that the FR may insert into the MAP channel.&#xD;
Note 1: If 1 is not an  element of the set of supported Packet Version Numbers, then incoming MAPP requests are disregarded by the FR. If 8 is not an element of the set of supported Packet Version Numbers, then incoming ENCAPP requests are disregarded. If both versions are allowed, then the data insertion is performed in the same sequence as the requests are received by the FR.&#xD;
Note 2: This parameter must be a subset of the valid-packet-version-numbers parameter of the TC encapsulation, VC Pachet Processing and VC Generation FR instance that consumes the MAP channel generated by this FR instance. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 2) OF IntUnsigned ({1,8})</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="encap-min-data-unit-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the minimum length in octets that the data unit argument of an incoming ENCAP request must have. If an incoming request does not meet this requirement, that request will be disregarded by the FR.&#xD;
If (8 NOT ELEMENT OF valid-packet-version-numbers), this parameter shall be flagged as 'undefined'.&#xD;
Note: The value of this parameter must be equal or greater than the encap-minimum-data-unit-length of the TC Encapsulation, VC Packet Processing and VC Generation FR instance that consumes the MAP channel generated by this FR instance. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 4294967287)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="encap-max-data-unit-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the maximum length in octets that the data unit argument of an incoming ENCAP request may have. If an incoming request does not meet this requirement, that request will be disregarded by the FR.&#xD;
If (8 NOT ELEMENT OF valid-packet-version-numbers), this parameter shall be flagged as 'undefined'.&#xD;
Note: The value of this parameter must equal or less than the encap-max-data-unit-length of the TC Encapsulation, VC Packet Processing and VC Generation FR instance that consumes the MAP channel generated by this FR instance. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 4294967287)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2016-06-16T00:00:00.000+0200" name="valid-protocol-ids" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the set of protocol IDs of which an encap request must contain one to be valid. The FR disregards incoming encap requests that are not valid.&#xD;
If (8 NOT ELEMENT OF valid-packet-version-numbers), this parameter shall be flagged as 'undefined'.&#xD;
Note: This parameter must be a subset of the valid-protocol-ids parameter of the TC Encapsulation, VC Packet Processing and VC Generation FR instance that consumes the MAP chnnel generated by this FR instance.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 8) OF IntUnsigned (0 .. 7)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="valid-protocol-id-extensions" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the set of protocol ID extensions of which an encap request must contain one to be valid if the protocol ID of that request is '6'. The FR disregards incoming encap requests that are not valid.&#xD;
If ((8 NOT ELEMENT OF valid-packet-version-numbers) OR (6 NOT ELEMENT OF valid-protocol-ids)), this parameter shall be flagged as 'undefined'.  </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 16) OF IntUnsigned (0 .. 15)</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="valid-map-ids" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the MAP IDs that are permitted on the Virtual Channel generated by the given FR instance and for each permitted MAP-ID the maximum packet length, if segmentation is permitted, if blocking is permitted and if so, which timeout period shall be applied.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 64) OF a sequence of IntUnsigned where  the sequence consists of up to 64 sequences where each of them has five elements. The first element specifies the MAP-ID, the second element specifies the maximum packet length applicable to the given MAP channel (6 .. 65537), the third element indicates whether segmentation of packets is permitted (0) or prohibited (1) on the given MAP channel, the fourth element specifies if more than one packet may be aggregated within one MAP channel frame data unit (blocking: permitted (0), prohibited (1)) and the fifth specifies the blocking timeout period in 1/1000 s and shall be set to zero in case blocking is prohibited.</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="map-multiplexing-scheme" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the MAP multiplexing scheme that the given FR instance applies to multiplex the MAP channels on the Virtual Channel. It can take on the following values:&#xD;
- 'fifo': the multiplexing is performed such that the MAPP requests queued for the different MAPs are inserted into the Virtual Channel in the same sequence as they get sent by the FRs generating these MAPP requests;&#xD;
- 'absolute priority': MAPP requests are multiplexed in the order of priority given to the MAP for which they have been queued where all priorities have to be different;&#xD;
- 'polling vector': the MAPP request queues of the MAP Channels are checked for MAPP requests ready to be inserted in the Virtual Channel according to the polling vector.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)&#xD;
{   fifo   (0)&#xD;
,   absolutePriority   (1)&#xD;
,   pollingVector   (2)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="map-multiplexing-control" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on how the MAP Channels are multiplexed on the Virtual Channel. In case map-multiplexing-scheme = ‘fifo’, this parameter will be flagged as undefined. If map-multiplexing-scheme = 'absolute priority', then this parameter contains a sequence of the MAP IDs used on the given Virtual Channel where the first MAP ID in the sequence has the highest priority, the second has the second-highest priority etc. Consequently the sequence has as many elements as MAP Channels exist on the given Virtual Channel of the given mission. If map-multiplexing-scheme = 'polling vector', then the sequence consists of up to 192 elements where each element is a MAP ID. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 192) OF IntUnsigned (0 .. 63)</type_definition>
    </parameter>
    <semantic_definition>Note: The present FR Model does not envisage the use of the &#xD;
MAPA.request primitive as an input to this FR type. Therefore, the &#xD;
parameters defined for this FR do not cover the case of incoming &#xD;
MAPA.request primitives. </semantic_definition>
  </functionalResource>
  <functionalResource oidBit="11" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="AOS VC Multiplexing">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>11</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="master-channel" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the spacecraft ID of the Master Channel that is generated by the given FR instance. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 255)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="valid-vc-ids" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the VCIDs that are permitted on the Master Channel generated by the given FR instance.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 64) OF IntUnsigned (0 .. 63)</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-02T00:00:00.000+0200" name="vc-multiplexing-scheme" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the VC multiplexing scheme that the given FR instance applies to multiplex the Virtual Channels on the Master Channel. It can take on the following values:&#xD;
- 'fifo': the multiplexing is performed such that the AOS VC frames queued for the different Virtual Channels are inserted into the Master Channel in the same sequence as they get queued by the FRs generating these frames;&#xD;
- 'absolute priority': AOS VC Frames are multiplexed in the order of priority given to the Virtual Channel for which they have been queued where all priorities have to be different;&#xD;
- 'polling vector': the AOS VC frame queues of the Virtual Channels are checked for AOS VC frames ready to be inserted in the Master Channel according to the polling vector.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)&#xD;
{   fifo   (0)&#xD;
,   absolutePriority   (1)&#xD;
,   pollingVector   (2)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="vc-multiplexing-control" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on how the Virtual Channels are multiplexed on the Master Channel. In case aos-vc-multiplexing-scheme = ‘fifo’, this parameter will be flagged as undefined. If aos-vc-multiplexing-scheme = 'absolute priority', then this parameter contains a sequence of the VCIDs used on the given Master Channel where the first VCID in the sequence has the highest priority, the second has the second-highest priority etc. Consequently the sequence has as many elements as Virtual Channels exist on the given Master Channel of the given mission. If aos-vc-multiplexing-scheme = 'polling vector', then the sequence consists of up to 192 elements where each element is a VCID. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 192) OF IntUnsigned (0 .. 63)</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="12" authorizingEntity="CSTS WG" creationDate="2014-06-14T00:00:00.000+0200" name="AOS Encapsulation, Packet Processing and VC Generation">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>12</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="valid-packet-version-numbers" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This  parameter reports on the Packet Version Numbers of packets that the FR may insert into the AOS VC Channel.&#xD;
Note 1: If 1 is not an element of the set of supported Packet Version Numbers, then incoming VCP requests are disregarded by the FR. If 8 is not an element of the set of supported Packet Version Numbers, then incoming ENCAP requests are disregarded. If both versions are allowed, then the data insertion is performed in the same sequence as the requests are received by the FR.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 2) OF IntUnsigned ({1,8})</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-16T00:00:00.000+0200" name="max-packet-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the maximum length in octets that a packet contained in an incoming PACKET or ENCAP request may have. The FR will disregard requests containing packets that exceed this limit. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (6 .. 65537)</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="13" authorizingEntity="CSTS WG" name="Return Space Link Carrier">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>13</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="production-status" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the return link carrier status and can take on four values:&#xD;
- 'configured': the return link equipment has been configured and the antenna moved to point, but due to geometry or spacecraft timeline, no carrier signal is expected to be seen at this time or the expected LOS time has passed where again LOS may be due to geometry or due to the spacecraft timeline;&#xD;
- 'operational': the return link is active, i.e., all receiving equipment is in nominal condition, the expected AOS time has passed and the expected LOS has not yet been reached;&#xD;
- 'interrupted': a failure has been detected, e.g. a receiver malfunction that prevents the reception of the carrier signal;&#xD;
- 'halted': the return link has been taken out of service, e.g. due to a power failure affecting the return link string.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 3)
{   configured   (0)
,   operational   (1)
,   interrupted   (2)
,   halted   (3)
}</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="signal-level" engineeringUnit="dBm">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the level of the received signal in dBm as observed at the LNA input. When the Automatic Gain Control (AGC) is in coherent mode and the modulation scheme uses a remnant carrier, then the reported level refers to the carrier power. In all other cases, the reported level refers to the total signal power. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (-250 ..  -30)</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="system-noise-temperature" engineeringUnit="K">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the operating system noise temperature in K derived from the noise density observed at the receiver input. As such, it takes into account all contributions to the noise temperature such as antenna microwave components, atmospheric noise and cosmic microwave background noise. The noise temperature varies with weather conditions and antenna elevation due to variation of the path length through the atmosphere and ground noise received by the antenna side lobes.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 ..  1000)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="polarization-angle" engineeringUnit="degree">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports (after acquisition of signal) on the power ratio of the signal received with left hand circular (LHC) polarization and the signal received with the orthogonal, i.e., right hand circular (RHC) polarization. If the angle reported is 0 degrees, then the full power is received via the LHC channel. At 45 degrees, the power in the LHC and RHC channels is equal, as if the input signal were linearly polarized. At 90 degrees, the full power is received with RHC polarization.&#xD;
Only stations supporting concurrent reception of LHC and RHC polarization provide this information. When this is not possible or the station is configured to use a single channel only, this parameter shall be flagged as unavailable. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 90)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="carrier-frequency-uncertainty" engineeringUnit="Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the band in Hz centered around the nominal return link carrier frequency, possibly corrected for the expected Doppler offset, in which the receiver shall search for the signal. This parameter is also valid in case of a suppressed carrier modulation scheme.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1500000)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="predict-mode" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter specifies for which condition the Doppler predicts have been calculated. It can take on three values:&#xD;
- 1-way: this mode will be used when the spacecraft is not locked to a forward link signal or while the spacecraft transponder is commanded to non-coherent mode or when the spacecraft receiver is in 'coherency enabled' mode and the forward link carrier frequency is ramped such that the Doppler on the forward link is compensated, i.e., the spacecraft always 'sees' the nominal forward link frequency; in this case it does not matter if the forward link is radiated by the same station that is receiving the return link or a different station; &#xD;
- 2-way: this mode is applied when the spacecraft receiver is commanded to 'coherency enabled' mode and the same station that is receiving the return link also radiates the forward link, the latter at a constant frequency;&#xD;
- 3-way: this mode is applied when the spacecraft receiver is in 'coherency enabled' mode and a station different from the one receiving the return link is radiating the forward link signal at a known constant frequency.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)&#xD;
{   1-way   (0)&#xD;
,   2-way   (1)&#xD;
,   3-way   (2)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="tracking-loop-bandwidth" engineeringUnit="1/10 Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the dual-sided tracking loop bandwidth in tenth Hz of the receiver.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 30000)</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="order-of-loop" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the order of the carrier tracking loop. It can take on the following values:&#xD;
- 'first order': such loop is hardly used as it has a static phase error even in case of a constant return link carrier frequency;&#xD;
- 'second': this is the most commonly used loop as it has no static phase error for a constant return link carrier frequency;&#xD;
- 'third order': such configuration may have to be used in case of high Doppler rates, as such loop has no static phase error even when the return link carrier frequency is sweeping, but initial acquisition is more difficult with such loop. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   first-order   (0)
,   second-order   (1)
,   third-order   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="carrier-lock" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the lock status of the receiver used for telemetry and possibly ranging. The values the parameter may have are:&#xD;
- 'locked': the receiver has locked on the return link signal;&#xD;
- 'not-locked': the receiver has not locked on the return link signal and therefore cannot deliver telemetry and Doppler measurements.&#xD;
This parameter is valid also in case of a suppressed carrier modulation scheme.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   locked   (0)&#xD;
,   not-locked   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="carrier-loop-mean-phase-error" engineeringUnit="1/100 rad">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the mean value of the phase error in 1/100 radians in the carrier tracking loop by accumulating the loop errors Ei over a period of n samples and then dividing by n. The mean M should be zero unless the loop is subject to a static phase error.
A given implementation shall specify the number of samples used to calculate this paramter. This shall be recorded in the Service Agreement.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (-629 .. 629)</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="carrier-loop-peak-phase-error" engineeringUnit="1/100 rad">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the peak absolute value of the phase error |Ei - M| in 1/100 radians in the carrier tracking loop observed in the most recent n samples.
A given implementation shall specify the number of samples used to calculate this paramter. This shall be recorded in the Service Agreement.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 629)</type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="carrier-loop-snr" engineeringUnit="1/100 dB">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter is derived from the carrier-loop-phase-error-std-deviation (std) as follows: SNR in 1/100 dB is given by  1000 log (2/(2PI std)^2) where log is to the base of 10. The carrier loop phase error standard deviation (or rms value) in rad over n samples, i.e. the sum of (Ei - M)^2 for i = 1 .. n is calculated, then divided by n and then the square root taken.&#xD;
A given implementation shall specify the number of samples used to calculate this paramter. This shall be recorded in the Service Agreement.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF INTEGER (- 2800 .. 10000)</type_definition>
    </parameter>
    <parameter oidBit="13" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="actual-receive-frequency" engineeringUnit="Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the observed carrier return link frequency in Hz. This parameter therefore varies with the Doppler shift induced by the radial velocity of the spacecraft relative to the ground based antenna. In 1-way mode, the Doppler shift applies only once, but also the onboard oscillator drift affects the observed return link carrier frequency. In 2-way mode in combination with a constant forward link frequency, the Doppler shift approximately doubles with respect to the 1-way case, but the contribution of the onboard oscillator drift is eliminated.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (2199700000 ..  38500000000)</type_definition>
    </parameter>
    <parameter oidBit="14" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="frequency-offset" engineeringUnit="Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the observed carrier return link offset in Hz with respect to the nominal return link carrier frequency. As such it reports on the onboard oscillator drift (in case of 1-way operation) plus the Doppler shift induced by the radial velocity between spacecraft and the ground-based antenna. In 2-way mode, the effect of the onboard oscillator drift is eliminated. In combination with a constant forward link frequency, the Doppler shift approximately doubles compared to the 1-way case.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (-5000000 ..  5000000)</type_definition>
    </parameter>
    <parameter oidBit="15" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="best-lock-frequency" engineeringUnit="Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the forward link frequency in Hz that corresponds to the non-coherent return link frequency divided by the transponder turnaround ratio in the Doppler free case. The spacecraft is expected to lock on the forward link, when it 'sees' this frequency. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (2024956000 .. 40501863000)</type_definition>
    </parameter>
    <parameter oidBit="16" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="doppler-std-deviation" engineeringUnit="Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the Doppler offset standard deviation in Hz over n samples. Each sample Si is the difference between the actual return link frequency and the predicted return link frequency where the predict takes into account the expected Doppler shift. Based on these samples, the mean Doppler offset M is calculated by forming the sum of n samples Si and dividing it by n. Then the sum of (Si - M)^2 for i = 1 .. n is calculated, then divided by n and then the square root taken.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 629)</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="14" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Return Space Link Subcarrier">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>14</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="subcarrier-demod-loop-bandwidth" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the subcarrier demodulator loop bandwidth expressed as symbol rate to subcarrier frequency ratio. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF REAL (10^-5 .. 10^-1)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="subcarrier-level-estimate" engineeringUnit="1/100 dB">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the subcarrier to carrier power ratio expressed in 1/100 dBc.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF INTEGER (-20000 .. 0)</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="subcarrier-lock-status" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the subcarrier lock status of the BPSK subcarrier demodulator. The values the parameter may have are:&#xD;
- 'locked': the demodulator has locked on the return link subcarrier;&#xD;
- 'not-locked':- the demodulator has not locked on the return link subcarrier and therefore cannot deliver telemetry.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   locked   (0)
,   not-locked   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="actual-subcarrier-frequency" engineeringUnit="1/1000 Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the actually received subcarrier frequency in 1/1000 Hz, i.e. this parameter reflects the Doppler shift of the subcarrier frequency. If the applicable modulation scheme does not use a subcarrier, this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (2000 .. 300000)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="subcarrier-waveform" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the subcarrier wave form. The values the parameter may have are:&#xD;
- 'sine': the subcarrier is a sinusodial wave;&#xD;
- 'square': the subcarrier is a square wave.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{  sine   (0)
,   square   (1)
}</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="15" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Return Symbol Stream">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>15</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="symbol-synchronizer-loop-bandwidth-a" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the symbol synchronizer loop bandwidth expressed as dual-sided symbol synchronizer loop bandwidth to symbol rate ratio applied to symbol stream a. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF REAL (10^-5 .. 10^-2)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="symbol-synchronizer-lock-status-a" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the symbol stream a synchronizer lock status. The values the parameter may have are:&#xD;
- 'locked': the symbol synchronizer has locked on the return link symbol stream a;&#xD;
- 'not-locked': the symbol synchronizer has not locked on the symbol stream a.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   locked   (0)&#xD;
,   not-locked   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="actual-symbol-rate-a" engineeringUnit="1/1000 symbols/s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the actually received symbol stream a rate in 1/1000 symbols/second, i.e., this parameter reflects the Doppler shift of the symbol rate.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (4000 .. 20000000000)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="es-over-no-a" engineeringUnit="1/100 dB">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the estimated symbol energy over noise density ratio (Es/No) in 1/100 dB observed for symbol stream a. The algorithms used to calculate this estimate tend to saturate at a certain Es/No level so that the reported estimate may be significantly too low. However, this saturation happens at levels that are so high that the telemetry is anyway virtually error free.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF INTEGER (-1000 .. 60000)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="symbol-synchronizer-loop-bandwidth-b" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the symbol synchronizer loop bandwidth expressed as dual-sided symbol synchronizer loop bandwidth to symbol rate ratio applied to symbol stream b.&#xD;
If the modulation scheme is such that only a single symbol stream is obtained, this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF REAL (10^-5 .. 10^-2)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="symbol-synchronizer-lock-status-b" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the symbol stream a synchronizer lock status. The values the parameter may have are:&#xD;
- 'locked': the symbol synchronizer has locked on the return link symbol stream b;&#xD;
- 'not-locked': the symbol synchronizer has not locked on the symbol stream b.&#xD;
If the modulation scheme is such that only a single symbol stream is obtained, this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   locked   (0)&#xD;
,   not-locked   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="actual-symbol-rate-b" engineeringUnit="1/1000 symbols/s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the actually received symbol stream b rate in 1/1000 symbols/second, i.e., this parameter reflects the Doppler shift of the symbol rate.&#xD;
If the modulation scheme is such that only a single symbol stream is obtained, this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (4000 .. 20000000000)</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="es-over-no-b">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the estimated symbol energy over noise density ratio (Es/No) in 1/100 dB observed for symbol stream b. The algorithms used to calculate this estimate tend to saturate at a certain Es/No level so that the reported estimate may be significantly too low. However, this saturation happens at levels that are so high that the telemetry is anyway virtually error free.&#xD;
If the modulation scheme is such that only a single symbol stream is obtained, this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF INTEGER (-1000 .. 60000)</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="16" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Range and Doppler Extraction">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>16</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="ranging-tone-or-pnchip-loop" engineeringUnit="1/1000 Hz">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports, in 1/1000 Hz, the dual sided bandwidth of the tone or PN chip tracking loop. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 3000)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="ranging-tone-pnchip-level" engineeringUnit="1/100 dB">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the tone/ pnchip to carrier power ratio expressed in 1/100 dBc.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF INTEGER (-20000 .. 0)</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="ranging-loop-lock-status" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated value reports the tone respectively PN chip loop lock status. It can take on two values:
- 'locked';
- 'not locked'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   locked   (0)
,   not-locked   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="estimated-effective-ranging-modulation-index" engineeringUnit="1/100 rad">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports an estimate in 1/100 radians of the effective ranging modulation index.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 140)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="code-number-pn-code-offset" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the code number up to which the replica has been correlated with the return link signal.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 24)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="ambiguity-resolved" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports in case of tone/code ranging if the ambiguity has been resolved and in case of PN ranging if lock on the PN sequence has been achieved. It can take on two values:&#xD;
- 'yes': the ranging system has reached the state where range measurements can be performed;&#xD;
- 'no': correlation of the forward link replica with the return link signal has not yet been achieved or has failed.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   yes   (0)
,   no   (1)
}</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="17" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Return TM Sync and Decoding">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>17</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="asm-correlation-error-a" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the number of symbols in the most recently received ASM that are different from the nominal ASM pattern on symbol stream a. When comparing these numbers, one needs to take into consideration whether the synchronization is done on the (pre Viterbi decoder) symbol stream or on the (post Viterbi decoder) bit stream.&#xD;
The frame synchronization is also used to remove the phase ambiguity of some modulation schemes. To that end, the correlation process is performed both for the standard ASM pattern and its inversion.&#xD;
A given implementation will specify if the the synchronization is performed in the symbol or bit domain. This shall be recorded in the Service Agreement.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 192)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="frame-synchronizer-lock-status-a" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the frame synchronizer lock status for symbol stream a. It can take on the following values:&#xD;
- 'locked': The synchronizer has found at least two Attached Sync Markers with the expected number of symbols or bits between them and with each ASM having a correlation error that is lower than the configured threshold;&#xD;
- 'verify': the frame synchronizer has found one ASM in the symbol or bit stream with the correlation error lower than the configured threshold and is looking for a second ASM at the expected number of symbols or bits after the first ASM; if such ASM is found, the lock status changes to 'locked'; if no ASM is found where expected, the lock status changes to 'not locked'; if an ASM is found, but at a larger distance in terms of symbols or bits than expected, that newly found ASM will be the reference for searching the next verification ASM;&#xD;
- not locked: the frame synchronizer did not find any ASM with a correlation error below the correlation error threshold. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)&#xD;
{   locked   (0)&#xD;
,   verify   (1)&#xD;
,  not-locked   (2)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="symbol-inversion-a" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if, based on the observed polarity of the ASM, the symbol stream a had to be inverted or not. It can take two values:&#xD;
- 'yes': the frame synchronizer locked on the inverted ASM pattern and therefore inverts the polarity of the symbol stream;&#xD;
- 'no': the frame synchronizer locked on the ASM with the pattern in positive logic and therefore does not invert the symbol stream.&#xD;
As long as frame-synchronizer-lock-status is ≠ 'locked', this parameter shall be flagged as unavailable.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   yes   (0)&#xD;
,   no   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="frame-error-rate-a">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>The parameter reports the ratio of symbol stream a erred frames to the total number of symbol stream a frames processed for the most recent n frames. If the frames are RS encoded, then frames for which the RS correction is not possible are considered erred. If the frames are not RS encoded, then the FECW is checked and frames for which the result of this check is negative are considered erred. In all other cases, i.e. if the frames are neither RS encoded nor do they contain a CCSDS compliant FECW, this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF REAL (0 .. 1)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="number-of-rs-errors-corrected-a" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the number of bits in the symbol stream a frame corrected by means of the RS trailer. The number of bits that can be corrected depend on the coding and the interleaving depth. If the applicable coding scheme does not use RS coding, this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 128)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="asm-correlation-error-b" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the number of symbols in the most recently received ASM that are different from the nominal ASM pattern on symbol stream b. When comparing these numbers, one needs to take into consideration whether the synchronization is done on the (pre Viterbi decoder) symbol stream or on the (post Viterbi decoder) bit stream.&#xD;
The frame synchronization is also used to remove the phase ambiguity of some modulation schemes. To that end, the correlation process is performed both for the standard ASM pattern and its inversion.&#xD;
A given implementation will specify if the the synchronization is performed in the symbol or bit domain. This shall be recorded in the Service Agreement.&#xD;
If the modulation scheme is such that only a single symbol stream is obtained, this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 192)</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="frame-synchronizer-lock-status-b" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the frame synchronizer lock status for symbol stream b. It can take on the following values:&#xD;
- 'locked': The synchronizer has found at least two Attached Sync Markers with the expected number of symbols or bits between them and with each ASM having a correlation error that is lower than the configured threshold;&#xD;
- 'verify': the frame synchronizer has found one ASM in the symbol or bit stream with the correlation error lower than the configured threshold and is looking for a second ASM at the expected number of symbols or bits after the first ASM; if such ASM is found, the lock status changes to 'locked'; if no ASM is found where expected, the lock status changes to 'not locked'; if an ASM is found, but at a larger distance in terms of symbols or bits than expected, that newly found ASM will be the reference for searching the next verification ASM;&#xD;
- not locked: the frame synchronizer did not find any ASM with a correlation error below the correlation error threshold.&#xD;
If the modulation scheme is such that only a single symbol stream is obtained, this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)&#xD;
{   locked   (0)&#xD;
,   verify   (1)&#xD;
,  not-locked   (2)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="symbol-inversion-b" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if, based on the observed polarity of the ASM, the symbol stream b had to be inverted or not. It can take two values:&#xD;
- 'yes': the frame synchronizer locked on the inverted ASM pattern and therefore inverts the polarity of the symbol stream;&#xD;
- 'no': the frame synchronizer locked on the ASM with the pattern in positive logic and therefore does not invert the symbol stream.&#xD;
As long as frame-synchronizer-lock-status is ≠ 'locked', this parameter shall be flagged as unavailable.&#xD;
If the modulation scheme is such that only a single symbol stream is obtained, this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   yes   (0)&#xD;
,   no   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="frame-error-rate-b" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>The parameter reports the ratio of symbol stream b erred frames to the total number of symbol stream b frames processed for the most recent n frames. If the frames are RS encoded, then frames for which the RS correction is not possible are considered erred. If the frames are not RS encoded, then the FECW is checked and frames for which the result of this check is negative are considered erred. In all other cases, i.e. if the frames are neither RS encoded nor do they contain a CCSDS compliant FECW, this parameter shall be flagged as undefined.&#xD;
If the modulation scheme is such that only a single symbol stream is obtained, this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF REAL (0 .. 1)</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="number-of-rs-errors-corrected-b">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the number of bits in the symbol stream b frame corrected by means of the RS trailer. The number of bits that can be corrected depend on the coding and the interleaving depth. If the applicable coding scheme does not use RS coding, this parameter shall be flagged as undefined.&#xD;
If the modulation scheme is such that only a single symbol stream is obtained, this parameter shall be flagged as 'undefined'. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 128)</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" name="ert-annotation-locked-to-reference">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the time tags used to annotate the telemetry frames with the Earth Receive Time (ERT) are generated by a time code generator slaved to a high precision reference or if this generator is free running. It can take on two values:
- 'yes' - The time tags are generated by a system that is locked to the station's frequency and timing system;
- 'no' - the system generating the time tags is free-running. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   yes   (0)
,   no   (1)
}</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="18" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="MC Demux &amp; Reception">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>18</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="master-channel-id" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>18</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the Master Channel ID the given FR instance is configured to process. If the Transfer Frame Version Number part of the MC-ID is '00', then the range of the MC-ID is 0 .. 1023.  If the Transfer Frame Version Number part of the MC-ID is '00', then the range of the MC-ID is 512 .. 767. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF IntUnsigned (0 .. 1023)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="clcw-extraction" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>18</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the FR instance shall extract CLCWs and forward them to the FR types that consume them. It can take on two values:&#xD;
- clcw: the CLCW shall be extracted from frame of the configured Master Channel;&#xD;
- no clcw: no CLCW extraction shall take place, either because the configured MC does not carry CLCWs or no FR is set up to consume the MC CLCW stream. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   clcw   (0)&#xD;
,   noClcw   (1)&#xD;
}</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="19" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="VC Demux &amp; Reception">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>19</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="virtual-channel-id" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>19</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the Virtual Channel ID the given FR instance is configured to process. If the Transfer Frame Version Number part of the MC-ID is '00', then the range of the VC-ID is 0 .. 7.  If the Transfer Frame Version Number part of the MC-ID is '00', then the range of the VC-ID is 0 .. 63. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF IntUnsigned (0 .. 63)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="clcw-extraction" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>19</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the FR instance shall extract CLCWs and forward them to the FR types that consume them. It can take on two values:&#xD;
- clcw: the CLCW shall be extracted from frame of the configured Virtual Channel;&#xD;
- no clcw: no CLCW extraction shall take place, either because the configured VC does not carry CLCWs or no FR is set up to consume the VC CLCW stream. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   clcw   (0)&#xD;
,   noClcw   (1)&#xD;
}</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="20" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Packet Extraction &amp; De-encapsulation">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>20</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="rfsp-apid-set" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the set of APIDs of the space packets that are to be forwarded by means of Packet.indication primitives to the Return File Service Production FR.  If the APID set contains an element set to the value -1, no space packets shall be forwarded to the Return File Service Production FR. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 2048) OF IntUnsigned (-1 .. 2047)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="rfsp-protocol-id-set" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the set of Protocol IDs of the encapsulation packets that are to be forwarded by means of ENCAP.indication primitives to the Return File Service Production FR.  If the Protocol ID set contains an element set to the value -1, no encapsulation packets shall be forwarded to the  Return File Service Production FR.&#xD;
Note: If the Protocol ID is '6', the encapsulation packet is only forwarded if the Protocol ID Extension is an element of the parameter rfsp-protocol-id-extension-set. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 8) OF IntUnsigned (-1 .. 7)</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="rfsp-protocol-id-extension-set" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the set of Protocol ID extensions of the encapsulation packets that are to be forwarded by means of ENCAP.indication primitives to the Return File Service Production FR.  If ((6 NOT element of rfsp-protocol-id-set) OR (-1 element of rfsp-protocol-id-set)), then this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 16) OF IntUnsigned (-1 .. 15)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="riocr-protocol-id-set" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the set of Protocol IDs of the encapsulation packets that are to be forwarded by means of ENCAP.indication primitives to the Rtn IP over CCSDS Router FR.  If the Protocol ID set contains an element set to the value -1, no encapsulation packets shall be forwarded to the  Rtn IP over CCSDS Router FR.&#xD;
Note: If the Protocol ID is '6', the encapsulation packet is only forwarded if the Protocol ID Extension is an element of the parameter riocr-protocol-id-extension-set. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 8) OF IntUnsigned (-1 .. 7)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="riocr-protocol-id-extension-set" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the set of Protocol ID extensions of the encapsulation packets that are to be forwarded by means of ENCAP.indication primitives to the Rtn IP over CCSDS Router FR.  If ((6 NOT element of riocr-protocol-id-set) OR (-1 element of riocr-protocol-id-set)), then this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 16) OF IntUnsigned (-1 .. 15)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="cre-apid-set" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the set of APIDs of the space packets that are to be forwarded by means of Packet.indication primitives to the CFDP Receiving Entity FR.  If the APID set contains an element set to the value -1, no space packets shall be forwarded to the CFDP Receiving Entity FR. &#xD;
Note: If the statndard APID assignement is used for the transfer of CFDP PDUs over space packets, then the APID is 2045.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 2048) OF IntUnsigned (-1 .. 2047)</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="cre-protocol-id-set" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the set of Protocol IDs of the encapsulation packets that are to be forwarded by means of ENCAP.indication primitives to the CFDP Receiving Entity FR.  If the Protocol ID set contains an element set to the value -1, no encapsulation packets shall be forwarded to the CFDP Receiving Entity FR.&#xD;
Note: If the standard protocol id assignment is used, then the protocol id '3' is used for the transfer of CFDP PDUs.&#xD;
Note: If the Protocol ID is '6', the encapsulation packet is only forwarded if the Protocol ID Extension is an element of the parameter cre-protocol-id-extension-set. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 8) OF IntUnsigned (-1 .. 7)</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="cre-protocol-id-extension-set" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the set of Protocol ID extensions of the encapsulation packets that are to be forwarded by means of ENCAP.indication primitives to the CFDP Receiving Entity FR.  If ((6 NOT element of cre-protocol-id-set) OR (-1 element of cre-protocol-id-set)), then this parameter shall be flagged as 'undefined'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 16) OF IntUnsigned (-1 .. 15)</type_definition>
    </parameter>
    <parameter authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="cfdp-pdu-extraction" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
        <oidBit>0</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter parameter reports if CFDP PDUs shall be extracted from space packets or encpsulation packets and forwarded to the CFDP sending entity. It can take on the following values:&#xD;
- space packet: the CFDP PDUs will be extrracted from spacepackets with the APID = 2045;&#xD;
- encapsulation packet: the CFDP PDUs are extracted from encapsulation packets with the protocol-id = 3;&#xD;
- no cfdp support: no extraction and forwarding of CFDP PDUs takes place. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   spacePacket   (0)&#xD;
,   encapsulationPacket   (1)&#xD;
,   noCfdpSupport   (2)&#xD;
}</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="21" authorizingEntity="CSTS WG" name="Frame Data Sink">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>21</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="service-package-id" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>21</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the service package on behalf of which telemetry frames are passed to one or more offline frame buffers.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF VisibleString (1 .. 255)</type_definition>
    </parameter>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="production-period" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>21</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the start and stop time of the period during which this FR instance forwards frames to the Offline Frame Buffer FR instances consuming the frame stream generated by this FR instance.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (2) OF Time</type_definition>
    </parameter>
    <semantic_definition>TBD</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="22" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Telemetry Segmenter">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>22</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="tm-segment-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>22</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the length of the telemetry segments in octets this FR instance is configured to generate from the incoming telemetry bit stream.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 16384)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="symbol-resolution" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>22</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the content of the segment generated by this FR. It can take on two values:&#xD;
- sign bit only: only the most signifcant bit of the symbol representation as provided by the Return Symbol Stream Reception FR is used, i.e., the soft bits are diaregarded; &#xD;
- soft symbols: the full resolution soft symbols as provided by the Return Symbol Stream Reception FR are used to build the TM segments.&#xD;
Note: The resolution available depends on the characteristics of the station equipment. The segments shall be built assuming an 8 bits symbol represenbtation. If such resoltion is not available, the symbols shall be padded with zeroes as required to obtain an eight bit representation. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   signBitOnly   (0)&#xD;
,   softSymbols   (1)&#xD;
}</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="23" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Telemetry Segment Sink">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>23</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="service-package-id" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>23</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the service package on behalf of which telemetry segments are passed to the Telemetry Segment Recording Buffer.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF VisibleString (1 .. 255)</type_definition>
    </parameter>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="production-period" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>23</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the start and stop time of the period during which this FR instance forwards telemetry segments to the Telemetry Segment Recording Buffer FR.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (2) OF Time</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="24" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="CFDP Sending Entity">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>24</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="entity-ids" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the entity id length and the entity IDs required for the CFDP core procedure where the first element of the parameter specifies the length of the entity IDs in octets, the second element reports the ID of the local, i.e. the sending entity and the third element reports the ID of the receiving entity. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (3)) OF IntUnsigned</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="eof-sent-indication" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the local CFDP entity is configured to provide an EOF-sent.indication to the Forward File Service Production FR when the initial transmission of the transaction's EOF PDU has been performed. It can take on two values:&#xD;
- EOF-sent indication enabled;&#xD;
- EOF-sent indication disabled.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   eofSentIndicationEnabled   (0)&#xD;
,   eofSentIndicationDisabled   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="fault-handler-override" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the default fault handler override, if any. If the parameter has the value '-1', the default fault handlers as specified in CCSDS 727.0.B-4 apply. Other values specify the overrides as per CCSDS 727.0.B-4.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF INTEGER (-1 .. 15)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="request-type" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the output format that the CFDP Sending Entity is configured to generate. It may take on four values:&#xD;
- ENCAP.request;&#xD;
- VCP.request;&#xD;
- PACKET.request;&#xD;
- MAPP.request.&#xD;
If request-type = encapRequest, then the trailing end of the UT address shall be the concatenation of the Packet Version Number set to 7 and the Embedded Protocol Id set to 3. &#xD;
If request-type ≠ encapRequest, then the trailing end of the UT address shall be the concatenation of the Packet Version Number set to 0 and the APID set to 2045. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)&#xD;
{   encapRequest   (0)&#xD;
,   vcpRequest   (1)&#xD;
,   packetRequest   (2)&#xD;
,   mappRequest   (3)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="transfer-frame-version-number" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the Transfer Frame Version Number (TVN) applicable to the space link protocol used to transfer the CFDP PDUs. The frames may be either TC frames or AOS frames</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   tcFrame   (0)&#xD;
,   aosFrame   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="spacecraft-id" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the spacecraft ID in the transfer frame headers used to transfer the CFDP PDUs.&#xD;
If (transfer-frame-version-number = 0) then the range of spacecraft-id is 0 .. 1023.&#xD;
If (transfer-frame-version-number = 1) then the range of spacecraft-id is 0 .. 255.  &#xD;
</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF IntUnsigned (0 .. 1023)</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="virtual-channel-id" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the virtual channel ID in the transfer frame headers used to transfer the CFDP PDUs.&#xD;
If (transfer-frame-version-number = 0) then the range of spacecraft-id is 0 .. 7.&#xD;
If (transfer-frame-version-number = 1) then the range of spacecraft-id is 0 .. 63.  </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF IntUnsigned (0 .. 63)</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="map-id" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the MAP ID in the segment header of the TC frames used to transfer the CFDP PDUs.&#xD;
If (request-type ≠ mappRequest) then this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF IntUnsigned (0 .. 63)</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="one-way-light-time" engineeringUnit="1/1000 s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports  the one-way light time in milliseconds to the remote CFDP entity. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF Duration [1]</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="nak-interval" engineeringUnit="1/1000 s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the NAK timer period in milliseconds the remote CFDP entity will apply. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF Duration [1]</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="keep-alive-interval" engineeringUnit="1/1000 s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the keep alive timer period in milliseconds the remote CFDP entity will apply. If the value of this parameter is zero, the remote entity does not to send keep alive PDUs periodically.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF Duration [1]</type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="report-interval" engineeringUnit="1/1000 s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the report timer period in milliseconds at which the remote CFDP entity will issue report.indication primitives. If the value of the parameter is zero, the remote entity does not to issue report.indication primitives periodically.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF Duration [1]</type_definition>
    </parameter>
    <parameter oidBit="13" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="nak-mode" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the remote CFDP entity will provide immediate or deferred NAKs. It can have the vales:&#xD;
- immediate;&#xD;
- deferred.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   immediate   (0)&#xD;
,   deferred   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="14" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="default-transmission-mode" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the default transmission mode of the remote CFDP entity. The parameter can take on two values:&#xD;
- acknowledged;&#xD;
- unacknowledged.&#xD;
</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   acknowledged   (0)&#xD;
,   unacknowledged   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="15" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="incomplete-file-handling" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports how the remote CFDP entity will dispose of an incomplete received file upon transaction cancellation. The parameter can take on two values:&#xD;
- discard;&#xD;
- retain.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{  discard   (0)&#xD;
,   retain   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="16" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="crc" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if at the remote CFDP entity the CRC option is active. It can have two values:&#xD;
- CRC present in PDUs;&#xD;
- CRC absent in PDUs.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{  crcPresent   (0)&#xD;
,   crcAbsent   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="17" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="max-file-segment-length" engineeringUnit="octets">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the maximum file segment length (in octets) the remote CFDP entity is able to handle.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF IntUnsigned</type_definition>
    </parameter>
    <parameter oidBit="18" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="nak-timer expiration-limit" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>18</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports how many times the NAK timer may expire at the remote CFDP entity without intervening reception of file data or metadata not previously received until that entity will declare a NAK Limit Reached fault.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF IntUnsigned</type_definition>
    </parameter>
    <parameter oidBit="19" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="transaction-inactivity-limit" engineeringUnit="1/1000 s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>19</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the maximum period in milliseconds that may pass without reception of a PDU until the remote CFDP entity will declare an Inactivity fault condition. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF Duration [1]</type_definition>
    </parameter>
    <parameter oidBit="20" authorizingEntity="CSTS WG" creationDate="2014-06-29T00:00:00.000+0200" name="reception-opportunity" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>24</oidBit>
        <oidBit>1</oidBit>
        <oidBit>20</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the start and end time of the reception opportunity at the remote CFDP entity.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (2) OF Time</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="25" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="CFDP Receiving Entity">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>25</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="entity-ids" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the entity id length and the entity IDs required for the CFDP core procedure where the first element of the parameter specifies the length of the entity IDs in octets, the second element reports the ID of the local, i.e. the receiving entity and the third element reports the ID of the sending entity. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (3)) OF IntUnsigned</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="eof-recv-indication" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the local CFDP entity is configured to provide an EOF-Recv.indication to the Return File Service Production FR when the EOF PDU associated with a transaction has been received from the sending end.  It can take on two values:&#xD;
- EOF-recv indication enabled;&#xD;
- EOF-recv indication disabled.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   eofRecvIndicationEnabled   (0)&#xD;
,   eofRecvIndicationDisabled   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="file-segment-recv-indication" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the local CFDP entity is configured to provide a File-Segment-Recv.indication to the Return File Service Production FR when individual file data segments have been received from the sending end. It can take on two values:&#xD;
- File-Segment-Recv indication enabled;&#xD;
- File-Segment-Recv indication disabled.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   fileSegmentRecvIndicationEnabled   (0)&#xD;
,   fileSegmentRecvIndicationDisabled   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="transaction-finished-indication" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the local CFDP entity is configured to provide a Transaction-Finished.indication to the Return File Service Production FR when the transaction is complete. It can take on two values:&#xD;
- Transaction-Finished indication enabled;&#xD;
- Transaction-Finished indication disabled.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   transactionFinishedIndicationEnabled   (0)&#xD;
,   transactionFinishedIndicationDisabled   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="suspended-indication" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the local CFDP entity is configured to provide a Suspended.indication to the Return File Service Production FR when the transaction has been suspended. It can take on two values:&#xD;
- Suspended indication enabled;&#xD;
- Suspended indication disabled.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   suspendedIndicationEnabled   (0)&#xD;
,   suspendedIndicationDisabled   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="resumed-indication" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the local CFDP entity is configured to provide a Resumed.indication to the Return File Service Production FR when the transaction has been resumed. It can take on two values:&#xD;
- Resumed indication enabled;&#xD;
- Resumed indication disabled.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   resumedIndicationEnabled   (0)&#xD;
,   resumedIndicationDisabled   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="fault-handler-override" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the default fault handler override, if any. If the parameter has the value '-1', the default fault handlers as specified in CCSDS 727.0.B-4 apply. Other values specify the overrides as per CCSDS 727.0.B-4.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF INTEGER (-1 .. 15)</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="one-way-light-time" engineeringUnit="1/1000 s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports  the one-way light time in milliseconds to the remote CFDP entity. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF Duration [1]</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="prompt-interval" engineeringUnit="1/1000 s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports on the prompt timer period in milliseconds the remote CFDP entity applies. If the value of the parameter is zero, the remote entity will not send periodic prompt PDUs.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF Duration [1]</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="keep-alive-discrepancy-limit" engineeringUnit="octet">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the discrepancy limit (in octets) between the progress monitored by observing the actual transmission and the progress monitored by means of the Keep Alive PDUs at the remote CFDP entity. When the limit is reached, the remote entity will declare a Keep Alive Limit Reached fault. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF IntUnsigned</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="positive-ack-timer-expiration-limit" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the maximum number of retransmissions of a given PDU the remote CFDP entity will perform until it declares a Positive ACK Limit Reached fault. A retransmission is performed whenever the ACK timer expires.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF IntUnsigned</type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="transaction-inactivity-limit" engineeringUnit="1/1000 s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the maximum period in milliseconds that may pass without reception of a PDU until the remote CFDP entity will declare an Inactivity fault condition. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1) OF Duration [1]</type_definition>
    </parameter>
    <parameter oidBit="13" authorizingEntity="CSTS WG" creationDate="2014-06-30T00:00:00.000+0200" name="transmission-opportunity" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>25</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the start and end time of the tranmission opportunity at the remote CFDP entity.</semantic_definition>
      <type_definition>TBD</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="26" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Offline Frame Buffer">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>26</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="27" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Telemetry Segment Recording Buffer">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>27</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="28" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Forward File Server">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>28</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="29" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Return File Server">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>29</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="30" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="FSP TS Provider">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>30</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="service-instance-identifier" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the identifier of the given service instance. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF VisibleString (SIZE (30 .. 256))</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="si-state" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the status of the given instance of the F-CLTU service. It can take on the following values:&#xD;
- 'unbound': all resources required to enable the provision of the Forward CLTU service have been allocated, and all objects required to provide the service have been instantiated; However, no association yet exists between the user and the provider, i.e., the F-CLTU transfer service provider port is not bound;&#xD;
- 'ready': an association has been established between the user and the provider, and they may interact by means of the service operations. However, sending of CLTUs from the user to the provider (by means of the CLTU-TRANSFER-DATA operation) is not permitted; the user may enable the delivery of CLTUs by means of the appropriate service operation (CLTU-START), which, in turn, will cause the provider to transition to the state 'active';&#xD;
- 'active':  this state resembles state ‘ready’, except that now the user can send CLTUs and the provider is enabled to radiate CLTUs to the spacecraft; the service continues in this state until the user invokes the CLTU-STOP operation to cause the provider to suspend transmission of CLTUs and transition back to state 'ready' or the PEER-ABORT invocation to cause the service to transition back to the 'unbound' state.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   unbound   (0)
,   ready   (1)
,   active   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="delivery-mode" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the delivery mode of the given instance of the FSP service. For the present version of this service only the ‘forward online’ delivery mode is defined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0)
{   fwd-online   (0)
}</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="return-timeout-period" engineeringUnit="s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the setting of the maximum time period in seconds permitted from when a confirmed FSP operation is invoked until the return is received by the invoker.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 600)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="production-status" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports on the status of the service production process used by the given instance of the FSP service. It can take on the following values:&#xD;
- 'configured': equipment has been assigned to support the service instance, but the production process is not yet capable of processing Space Packets;&#xD;
- 'operational BD': the production process has been configured for support, has completed the acquisition sequence, and is capable of processing Space Packets and radiating them in BD transmission mode; the AD transmission mode is currently not supported;&#xD;
- 'operational AD and BD': the production process has been configured for support, has completed the acquisition sequence, and is capable of processing Space Packets and radiating them in any transmission mode;&#xD;
- 'operational AD suspended': a TC frame has been transmitted the transmission-limit number of times but no acknowledgement by CLCW has been received; the AD mode has therefore been suspended;&#xD;
- 'interrupted': the production process is stopped due to a fault;&#xD;
- 'halted': the production process is stopped and production equipment is out of service due to management action.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 3)
{   configured   (0)
,   operational-bd   (1)
,   operational-ad-bd   (2)
,   operational-ad-suspended   (3)
,   interrupted   (4)
,   halted   (5)
}</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="rf-available-required" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the RF lock flag in the CLCW shall be reflected in the service provider’s production-status parameter. It can take on the following values:&#xD;
- 'yes': the ‘No RF available’ flag in the CLCW must be false in order for the provider to set production-status to ‘operational’;&#xD;
- 'no': the CLCW ‘No RF available’ flag shall be ignored.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   'yes'   (0)&#xD;
,   'no'   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="bit-lock-required" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the bit lock flag in the CLCW shall be reflected in the service provider’s production-status parameter. It can take on the following values:&#xD;
- 'yes': the ‘No bit lock’ flag in the CLCW must be false in order for the provider to set production-status to ‘operational’;&#xD;
- 'no': the CLCW ‘No bit lock’ flag shall be ignored.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   yes   (0)&#xD;
,   no   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="directive-invocation-enabled" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the given service instance is permitted to invoke directives. This parameter can take on two values:&#xD;
- 'enabled': this service instance is permitted to invoke directives for the given Virtual Channel;&#xD;
- 'disabled': directives cannot be invoked using this service instance.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   enabled   (0)
,  disabled   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="directive-invocation-online" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the service instance that is permitted to invoke directives for the given VC, if any, is in the state 'active' (cf. si-state). At most one service instance for a given VC will be configured to have the capability to invoke directives. This parameter can take on two values:&#xD;
- 'yes': the service instance permitted to invoke directives for the given Virtual Channel is 'active';&#xD;
- 'no': it is presently not possible to invoke directives for the given VC, i.e., the service instance permitted to invoke directives for the given Virtual Channel is 'unbound' or 'ready'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   'yes'   (0)
,   no   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="permitted-transmission-mode" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the transmission mode that the given service instance may use for the Space Packets that it processes. This parameter can take on two values: &#xD;
- 'expedited': the Space Packets will be embedded in TC frames that will be radiated in BD mode;&#xD;
- 'sequence controlled': the Space Packets will be embedded in TC frames that will be radiated in AD mode; &#xD;
- 'any': the service supports either transmission mode and will therefore transmit a Space Packet in the mode requested in the FSP-DATA-TRANSFER invocation.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   expedited   (0)
,   sequence-controlled   (1)
,   any   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="apid-list" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports all APIDs that the Space Packets processed by the given service instance may contain. If all APIDs are permitted, this parameter shall take the value -1.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1 .. 2048)) OF Integer (0 .. 2047, -1)</type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="reporting-cycle" engineeringUnit="s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the current setting of the time in seconds between successive FSP-STATUS-REPORT invocations sent by the FSP service provider. The permissible values are in the range (2 .. 600).  If cyclic reporting is off, the value reported is undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (2 .. 600)</type_definition>
    </parameter>
    <parameter oidBit="13" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="expected-packet-identification" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the value of the packet-identification the FSP service provider expects to receive in the next FSP-TRANSFER-DATA invocation for this invocation to be valid. As long as si-state ≠ 'active', the value reported will be zero.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 ..  4294967295)</type_definition>
    </parameter>
    <parameter oidBit="14" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="expected-directive-identification" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the value of the directive-invocation-identification the FSP service provider expects to receive in the next FSP-INVOKE-DIRECTIVE invocation for this invocation to be valid. The initial value of this parameter is zero.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 ..  4294967295)</type_definition>
    </parameter>
    <parameter oidBit="15" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="expected-event-invocation-identification" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>30</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the value of the event-invocation-identification the FSP service provider expects to receive in the next FSP-THROW-EVENT invocation for this invocation to be valid. The initial value of this parameter is zero.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 ..  4294967295)</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="31" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="FCLTU TS Provider">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>31</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="service-instance-identifier" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the identifier of the given service instance. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF VisibleString (SIZE (30 .. 256))</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="delivery-mode" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the delivery mode of the given instance of the F-CLTU service. For the present version of this service only the ‘forward online’ delivery mode is defined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0)
{   fwd-online   (0)
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="return-timeout-period" engineeringUnit="s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the setting of the maximum time period in seconds permitted from when a confirmed F-CLTU operation is invoked until the return is received by the invoker.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 600)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="notification-mode" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports how the F-CLTU provider notifies certain changes of production-status. It can take on two values:&#xD;
- 'immediate': the user is notified of a production-status change to 'interrupted' as soon as this transition is detected;&#xD;
- 'deferred': the user is notified about the production-status change only if and when the radiation of a CLTU is affected.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   immediate   (0)
,   deferred   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="protocol-abort-mode" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the way the F-CLTU service provider will act in the event of a protocol abort. This parameter can take on two values:&#xD;
- 'abort': service production will cease in the event of a protocol abort;&#xD;
- 'continue': service production will disregard the protocol abort event and continue radiating the CLTUs already buffered at the time of the event.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   abort   (0)
,   continue   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="si-state" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the status of the given instance of the F-CLTU service. It can take on the following values:&#xD;
- 'unbound': all resources required to enable the provision of the Forward CLTU service have been allocated, and all objects required to provide the service have been instantiated; However, no association yet exists between the user and the provider, i.e., the F-CLTU transfer service provider port is not bound;&#xD;
- 'ready': an association has been established between the user and the provider, and they may interact by means of the service operations. However, sending of CLTUs from the user to the provider (by means of the CLTU-TRANSFER-DATA operation) is not permitted; the user may enable the delivery of CLTUs by means of the appropriate service operation (CLTU-START), which, in turn, will cause the provider to transition to the state 'active';&#xD;
- 'active':  this state resembles state ‘ready’, except that now the user can send CLTUs and the provider is enabled to radiate CLTUs to the spacecraft; the service continues in this state until the user invokes the CLTU-STOP operation to cause the provider to suspend transmission of CLTUs and transition back to state 'ready' or the PEER-ABORT invocation to cause the service to transition back to the 'unbound' state.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   unbound   (0)
,   ready   (1)
,   active   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="reporting-cycle" engineeringUnit="s">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the current setting of the time in seconds between successive CLTU-STATUS-REPORT invocations sent by the F-CLTU service provider. The permissible values are in the range (2 .. 600). If cyclic reporting is off, the value reported is undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (2 .. 600)</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="production-status" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the status of the service production process used by the given instance of a F-CLTU service. It can take on the following values:&#xD;
- 'configured': equipment has been assigned to support the service instance, but the production process is not yet capable of radiating CLTUs;&#xD;
- 'operational': the production process has been configured for support, has completed the acquisition sequence, and is capable of radiating CLTUs;&#xD;
- 'interrupted': the production process is stopped due to a fault;&#xD;
- 'halted': the production process is stopped and production equipment is out of service due to management action.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 3)
{   configured   (0)
,   operational   (1)
,   interrupted   (2)
,   halted   (3)
}</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="rf-available-required" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the RF lock flag in the CLCW shall be reflected in the service provider’s production-status parameter. It can take on the following values:&#xD;
- 'yes': the ‘No RF available’ flag in the CLCW must be false in order for the provider to set production-status to ‘operational’;&#xD;
- 'no': the CLCW ‘No RF available’ flag shall be ignored.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   'yes'   (0)&#xD;
,   'no'   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" creationDate="2014-06-17T00:00:00.000+0200" name="bit-lock-required" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if the bit lock flag in the CLCW shall be reflected in the service provider’s production-status parameter. It can take on the following values:&#xD;
- 'yes': the ‘No bit lock’ flag in the CLCW must be false in order for the provider to set production-status to ‘operational’;&#xD;
- 'no': the CLCW ‘No bit lock’ flag shall be ignored.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)&#xD;
{   yes   (0)&#xD;
,   no   (1)&#xD;
}</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="expected-cltu-identification" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the value of the cltu-identification the F-CLTU service provider expects to receive in the next CLTU-TRANSFER-DATA invocation for this invocation to be valid. As long as si-state ≠ 'active', the value reported will be zero.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 4294967295)</type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="expected-event-invocation-identification" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the value of the event-invocation-identification the F-CLTU service provider expects to receive in the next CLTU-THROW-EVENT invocation for this invocation to be valid. The initial value of this parameter is zero.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 4294967295)</type_definition>
    </parameter>
    <parameter oidBit="13" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="number-of-cltus-received" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the total number of CLTUs received while the given service instance is  accessible to the user. Only CLTUs that the service provider accepted and consequently buffered are counted in the total.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned</type_definition>
    </parameter>
    <parameter oidBit="14" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="number-of-cltus-processed" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the number of CLTUs that the provider attempted to radiate while the given service instance has been active including
- CLTUs that radiated successfully;
- CLTUs that expired;
- CLTUs that aborted;
- a CLTU in the process of being radiated.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned</type_definition>
    </parameter>
    <parameter oidBit="15" authorizingEntity="CSTS WG" creationDate="2014-06-18T00:00:00.000+0200" name="number-of-cltus-radiated" engineeringUnit="none">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>31</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the number of CLTUs that the provider successfully radiated completely during the service provision period. A CLTU in the process of being radiated is not included in this count.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned</type_definition>
    </parameter>
    <semantic_definition>None</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="32" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Forward Frame CSTS Provider">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>32</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="33" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Cross Support File Transfer Service Provider">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>33</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="34" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="RAF TS Provider">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>34</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" name="service-instance-identifier">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the identifier of the given service instance. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF VisibleString (SIZE (30 .. 256))</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" name="delivery-mode">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the delivery mode of the given RAF service instance. It can take on three values:
- 'timely online'  - the timely online delivery mode limits the size of the backlog of not yet delivered data that is allowed to accumulate by discarding data that cannot be delivered within a certain time. Furthermore, when data is discarded, it is discarded ‘in
chunks’, i.e., as a sufficiently large block of contiguous frames rather than as random frames here and there; in general, this approach maximizes the usefulness of the data that is delivered.
- 'complete online' - this delivery mode attempts to deliver all acquired frames having the user selected characteristics, in order, with minimum delay consistent with the available ground communications bandwidth. To that end, the service provider has a buffer sufficiently large to deal with communications service delays, outages, and bandwidth limitations;
- 'offline' - in this delivery mode, the provider side buffer enables data to be delivered hours or days after their acquisition. To that end, this buffer is sufficiently large to hold all data that might be accumulated during several space link sessions.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   timely-online   (0)
,   complete-online   (1)
,   offline   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" name="return-timeout-period">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the setting of the maximum time period in seconds permitted from when a confirmed RAF operation is invoked until the return is received by the invoker.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 600)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" name="latency-limit">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the maximum allowable delivery latency time, in seconds, for the online delivery modes, i.e., the maximum delay from when the frame is acquired by the provider until it is delivered to the user: This parameter shall be flagged as undefined if delivery-mode = 'offline'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 100)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" name="transfer-buffer-size">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the number of frames the provider shall block in one RAF-PDU before passing it to the underlying communications layer except if expiry of latency-limit requires earlier release of the RAF-PDU. If delivery-mode = 'offline', latency-limit has no effect.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 1000)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" name="permitted-frame-quality">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the set of the quality of the frames that the user may select with the given RAF service instance. The permitted frame quality settings must be chosen from the following set of values: 
- 'good' - only frames that based on successful RS decoding/correcting or, in the absence of RS encoding, based on the check of the FECF are assumed to be error free will be delivered to the user;
- 'erred' - only frames that based on unsuccessful RS decoding/correcting or, in the absence of RS encoding, based on the failed check of the FECF were found to contain errors will be delivered to the user;
- 'all'  - all frames regardless if error free or not are delivered to the user; this includes telemetry frames for which due to lack of compatibility with the pertinent CCSDS Recommendations the quality cannot be determined.</semantic_definition>
      <type_definition>SET (SIZE (1 .. 3)) OF SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   good   (0)
,   erred   (1)
,   all   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" name="si-state">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the status of the given instance of the RAF service. It can take on the following values:
- 'unbound' - All resources required to enable the provision of the RAF service have been allocated, and all objects required to provide the service have been instantiated; however, no association yet exists between the user and the provider, i.e., the RAF transfer service provider port is not bound;
- 'ready'- An association has been established between the user and the provider, and they may interact by means of the service operations. However, sending of telemetry frames from the provider to the user (by means of the RAF-TRANSFER-DATA operation) is not permitted; the user may enable the delivery of telemetry frames by means of the appropriate service operation (RAF-START), which, in turn, will cause the provider to transition to the state 'active';
- 'active' -  This state resembles state ‘ready’, except that now the provider will send telemetry frames provided frames of the selected characteristics are made available by the RAF production process; the service continues in this state until the user invokes the RAF-STOP operation to cause the provider to suspend delivery of telemetry frames and transition back to state 'ready' or the PEER-ABORT invocation to cause the service to transition back to the 'unbound' state.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   unbound   (0)
,   ready   (1)
,   active   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" name="reporting-cycle">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the current setting of the time in seconds between successive RAF-STATUS-REPORT invocations sent by the RAF service provider. The permissible values are in the range (2 .. 600). If cyclic reporting is off, the value reported is zero.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 600)</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" name="production-status">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the status of the service production process used by the given instance of an RAF service. It can take on the following values:
- 'running' - the RAF production process is capable of processing a return space link physical channel, if available;
- 'interrupted' - the RAF production process is stopped due to a fault;
- 'halted' - the RAF production process is stopped and production equipment is out of service due to management action.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   running   (0)
,   interrupted   (1)
,   halted   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" name="requested-frame-quality">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the quality of the frames that shall be delivered by the given RAF service instance. It can take on three values:
- 'good' - only frames that based on successful RS decoding/correcting or, in the absence of RS encoding, based on the check of the FECF are assumed to be error free will be delivered to the user;
- 'erred' - only frames that based on unsuccessful RS decoding/correcting or, in the absence of RS encoding, based on the failed check of the FECF were found to contain errors will be delivered to the user;
- 'all'  - all frames regardless if error free or not are delivered to the user; this includes telemetry frames for which due to lack of compatibility with the pertinent CCSDS Recommendations the quality cannot be determined.
If the given service instance does not constrain this parameter to a single value, it shall be flagged 'undefined' whenever si-state ≠ 'active'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   good   (0)
,   erred   (1)
,   all   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" name="number-of-error-free-frames-delivered">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the  total number of telemetry frames that were annotated with a frame-quality of ‘good’ and delivered to the user since the start of the service instance provision period.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned</type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" name="number-of-frames-delivered">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>34</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the  total number of telemetry frames that were delivered to the user since the start of the service instance provision period.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="35" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="RCF TS Provider">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>35</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" name="service-instance-identifier">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>35</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the identifier of the given service instance. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF VisibleString (SIZE (30 .. 256))</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" name="delivery-mode">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>35</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the delivery mode of the given RCF service instance. It can take on three values:
- 'timely online'  - the timely online delivery mode limits the size of the backlog of not yet delivered data that is allowed to accumulate by discarding data that cannot be delivered within a certain time. Furthermore, when data is discarded, it is discarded ‘in
chunks’, i.e., as a sufficiently large block of contiguous frames rather than as random frames here and there; in general, this approach maximizes the usefulness of the data that is delivered.
- 'complete online' - this delivery mode attempts to deliver all acquired frames having the user selected characteristics, in order, with minimum delay consistent with the available ground communications bandwidth. To that end, the service provider has a buffer sufficiently large to deal with communications service delays, outages, and bandwidth limitations;
- 'offline' - in this delivery mode, the provider side buffer enables data to be delivered hours or days after their acquisition. To that end, this buffer is sufficiently large to hold all data that might be accumulated during several space link sessions.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   timely-online   (0)
,   complete-online   (1)
,   offline   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" name="return-timeout-period">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>35</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the setting of the maximum time period in seconds permitted from when a confirmed RCF operation is invoked until the return is received by the invoker.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 600)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" name="latency-limit">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>35</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the maximum allowable delivery latency time, in seconds, for the online delivery modes, i.e., the maximum delay from when the frame is acquired by the provider until it is delivered to the user: this parameter shall be flagged as undefined if delivery-mode = 'offline'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 100)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" name="transfer-buffer-size">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>35</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the number of frames the provider shall block in one RCF-PDU before passing it to the underlying communications layer except if expiry of latency-limit requires earlier release of the RCF-PDU. If delivery-mode = 'offline', latency-limit has no effect.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 100)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" name="permitted-global-vcid-set ">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>35</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the set of Master and/or Virtual Channel that the given RCF service instance permits the user to select. The parameter is a set of the concatenation of the CCSDS assigned Spacecraft Identifier (SCID), the Transfer Frame Version Number (TFVN) and, if applicable, the Virtual Channel Identifier (VCID). The range of the Spacecraft Identifier and the Virtual Channel Identifier depend on the TFVN as follows:
- TFVN = 0 (version 1) - SCID = (0 .. 1023)10, VCID = (0 .. 7)10;
- TFVN = 1 (version 2) - SCID = (0 .. 255)10, VCID = (0 .. 63)10.</semantic_definition>
      <type_definition>SET OF SEQUENCE (SIZE (3)) OF IntUnsigned, where 
the first element is the SCID (0 .. 1023), 
the second element is the TFVN (0 .. 1); and 
the third element is the VCID (0 .. 63).
As to have a way for expressing also the selection of the Master Channel, the 'special' VCID value 99 is used to indicate that the VCID may have any value. Therefore the exact range specification is:
VCID ϵ {0 .. 63,99}    </type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" name="si-state">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>35</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the status of the given instance of the RCF service. It can take on the following values:
- 'unbound' - All resources required to enable the provision of the RCF service have been allocated, and all objects required to provide the service have been instantiated; however, no association yet exists between the user and the provider, i.e., the RCF transfer service provider port is not bound;
- 'ready'- An association has been established between the user and the provider, and they may interact by means of the service operations. However, sending of telemetry frames from the provider to the user (by means of the RCF-TRANSFER-DATA operation) is not permitted; the user may enable the delivery of telemetry frames by means of the appropriate service operation (RCF-START), which, in turn, will cause the provider to transition to the state 'active';
- 'active' -  This state resembles state ‘ready’, except that now the provider will send telemetry frames provided frames of the selected characteristics are made available by the RCF production process; the service continues in this state until the user invokes the RCF-STOP operation to cause the provider to suspend delivery of telemetry frames and transition back to state 'ready' or the PEER-ABORT invocation to cause the service to transition back to the 'unbound' state.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   unbound   (0)
,   ready   (1)
,   active   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" name="reporting-cycle">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>35</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the current setting of the time in seconds between successive RCF-STATUS-REPORT invocations sent by the RCF service provider. The permissible values are in the range (2 .. 600). If cyclic reporting is off, the value reported is zero.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 600)</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" name="production-status">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>35</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the status of the service production process used by the given instance of an RCF service. It can take on the following values:
- 'running' - the RCF production process is capable of processing a return link Master or Virtual Channel, if available;
- 'interrupted' - the RCF production process is stopped due to a fault;
- 'halted' - the RCF production process is stopped and production equipment is out of service due to management action.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   running   (0)
,   interrupted   (1)
,   halted   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" name="requested-global-vcid">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>35</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the Master or Virtual Channel that the given RCF service instance shall deliver to the user. The parameter is a concatenation of the CCSDS assigned Spacecraft Identifier (SCID), the Transfer Frame Version Number (TFVN) and, if applicable, the Virtual Channel Identifier (VCID). The range of the Spacecraft Identifier and the Virtual Channel Identifier depend on the TFVN as follows:
- TFVN = 0 (version 1) - SCID = (0 .. 1023)10, VCID = (0 .. 7)10;
- TFVN = 1 (version 2) - SCID = (0 .. 255)10, VCID = (0 .. 63)10.
If the global VCID is not constrained to a single value by the given RCF service instance (see permitted-global-vcid-set), then this parameter shall be flagged undefined as long as si-state ≠ 'active.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (3)) OF IntUnsigned, where 
the first element is the SCID (0 .. 1023), 
the second element is the TFVN (0 .. 1); and 
the third element is the VCID (0 .. 63).
As to have a way for expressing also the selection of the Master Channel, the 'special' VCID value 99 is used to indicate that the VCID may have any value. Therefore the exact range specification is:
VCID ϵ {0 .. 63,99}    </type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" name="number-of-frames-delivered">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>35</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the  total number of telemetry frames that were delivered to the user since the start of the service instance provision period.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="36" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="ROCF TS Provider">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>36</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" name="service-instance-identifier">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the identifier of the given service instance. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF VisibleString (SIZE (30 .. 256))</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" name="delivery-mode">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the delivery mode of the given ROCF service instance. It can take on three values:
- 'timely online'  - the timely online delivery mode limits the size of the backlog of not yet delivered data that is allowed to accumulate by discarding data that cannot be delivered within a certain time. Furthermore, when data is discarded, it is discarded ‘in
chunks’, i.e., as a OCFs extracted from a sufficiently large block of contiguous frames rather than as OCFs from random frames here and there; in general, this approach maximizes the usefulness of the data that is delivered.
- 'complete online' - this delivery mode attempts to deliver the OCFs having the user selected characteristics from all acquired frames, in order, with minimum delay consistent with the available ground communications bandwidth. To that end, the service provider has a buffer be sufficiently large to deal with communications service delays, outages, and bandwidth limitations;
- 'offline' - in this delivery mode, the provider side buffer enables data to be delivered hours or days after their acquisition. To that end, this buffer is sufficiently large to hold all data that might be accumulated during several space link sessions.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   timely-online   (0)
,   complete-online   (1)
,   offline   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" name="return-timeout-period">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the setting of the maximum time period in seconds permitted from when a confirmed ROCF operation is invoked until the return is received by the invoker.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 600)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" name="latency-limit">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the maximum allowable delivery latency time, in seconds, for the online delivery modes, i.e., the maximum delay from when the provider extracts an OCF from a newly acquired frame until it is delivered to the user: this parameter shall be flagged as undefined if delivery-mode = 'offline'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 100)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" name="transfer-buffer-size">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the number of OCFs the provider shall block in one ROCF-PDU before passing it to the underlying communications layer except if expiry of latency-limit requires earlier release of the ROCF-PDU. If delivery-mode = 'offline', latency-limit has no effect.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1 .. 100)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" name="permitted-global-vcid-set ">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the telemetry Master and/or Virtual Channel out of which the given ROCF service instance extracts the OCFs. The parameter is a set of the concatenation of the CCSDS assigned Spacecraft Identifier (SCID), the Transfer Frame Version Number (TFVN) and, if applicable, the Virtual Channel Identifier (VCID). The range of the Spacecraft Identifier and the Virtual Channel Identifier depend on the TFVN as follows:
- TFVN = 0 (version 1) - SCID = (0 .. 1023)10, VCID = (0 .. 7)10;
- TFVN = 1 (version 2) - SCID = (0 .. 255)10, VCID = (0 .. 63)10.</semantic_definition>
      <type_definition>SET (SIZE (1 .. 65) OF SEQUENCE (SIZE (3)) OF IntUnsigned, where 
the first element is the SCID (0 .. 1023), 
the second element is the TFVN (0 .. 1); and 
the third element is the VCID (0 .. 63).
As to have a way for expressing also the selection of the Master Channel, the 'special' VCID value 99 is used to indicate that the VCID may have any value. Therefore the exact range specification is:
VCID ϵ {0 .. 63,99}    </type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" name="permitted-control-word-type-set ">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the set of OCF types that the given ROCF service instance permits the user to select. Three types are defined:
- 'all control word types' - all OCFs shall be delivered regardless of their type;
- 'clcw' - only OCFs containing the CCSDS defined Communication Link Control Word (CLCW) data structure shall be delivered;
- 'not-clcw' - only privately defined OCFs shall be delivered.   </semantic_definition>
      <type_definition>SET (SIZE (1 .. 3)) OF SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   all-control-word-types   (0)
,   clcw   (1)
,   not-clcw   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" name="permitted-tc-vcid-set">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the TC Master Channel and/or the Virtual Channels that the CLCWs that shall be extracted are associated with. If requested-control-word-type ≠ 'clcw', this parameter shall be flagged as undefined. </semantic_definition>
      <type_definition>SET (SIZE (1 .. 64) OF SEQUENCE (SIZE (3)) OF IntUnsigned, where 
the first element is the SCID (0 .. 1023), 
the second element is the TFVN (0); and 
the third element is the VCID (0 .. 63).</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" name="permitted-update-mode">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the update modes that the given ROCF service instance permits. The update modes are:
- 'continuous' - the given ROCF service permits the 'continuous' mode, i.e. the OCF service provider delivers each OCF that fulfills the delivery criteria specified by the ROCF-START invocation parameters start-time, stop-time, requested-global-VCID, control-word-type, and tc-vcid;
- 'change-based' - the ROCF service provider delivers those OCFs that fulfill the delivery criteria specified by the ROCF-START invocation parameters start-time, stop-time, requested-global-VCID, control-word-type, and tc-vcid provided the content of the OCF is different than the one of the OCF with the same tc-vcid value previously delivered. </semantic_definition>
      <type_definition>SET (SIZE (1 .. 2)) OF SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   continuous   (0)
,   change-based   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" name="si-state">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the status of the given instance of the ROCF service. It can take on the following values:
- 'unbound' - All resources required to enable the provision of the ROCF service have been allocated, and all objects required to provide the service have been instantiated; however, no association yet exists between the user and the provider, i.e., the ROCF transfer service provider port is not bound;
- 'ready'- An association has been established between the user and the provider, and they may interact by means of the service operations. However, sending of Operational Control Fields (OCFs) from the provider to the user (by means of the ROCF-TRANSFER-DATA operation) is not permitted; the user may enable the delivery of OCFs by means of the appropriate service operation (ROCF-START), which, in turn, will cause the provider to transition to the state 'active';
- 'active' -  This state resembles state ‘ready’, except that now the provider will send OCFs provided frames of the selected characteristics are made available by the ROCF production process; the service continues in this state until the user invokes the ROCF-STOP operation to cause the provider to suspend delivery of OCFs and transition back to state 'ready or the PEER-ABORT invocation to cause the service to transition back to the 'unbound' state.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   unbound   (0)
,   ready   (1)
,   active   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" name="reporting-cycle">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the current setting of the time in seconds between successive ROCF-STATUS-REPORT invocations sent by the ROCF service provider. The permissible values are in the range (2 .. 600). If cyclic reporting is off, the value reported is undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (2 .. 600)</type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" name="production-status">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the status of the service production process used by the given instance of an ROCF service. It can take on the following values:
- 'running' - the ROCF production process is capable of processing a return link Master or Virtual Channel, if available;
- 'interrupted' - the ROCF production process is stopped due to a fault;
- 'halted' - the ROCF production process is stopped and production equipment is out of service due to management action.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   running   (0)
,   interrupted   (1)
,   halted   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="13" authorizingEntity="CSTS WG" name="requested-global-vcid">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>13</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the set of Master and/or Virtual Channel that the given ROCF service instance permits the user to select. The parameter is a set of the concatenation of the CCSDS assigned Spacecraft Identifier (SCID), the Transfer Frame Version Number (TFVN) and, if applicable, the Virtual Channel Identifier (VCID). The range of the Spacecraft Identifier and the Virtual Channel Identifier depend on the TFVN as follows:
- TFVN = 0 (version 1) - SCID = (0 .. 1023)10, VCID = (0 .. 7)10;
- TFVN = 1 (version 2) - SCID = (0 .. 255)10, VCID = (0 .. 63)10.
If the global VCID is not constrained to a single value by the given ROCF service instance, then this parameter shall be flagged as undefined as long as si-state ≠ 'active.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (3)) OF IntUnsigned, where 
the first element is the SCID (0 .. 1023), 
the second element is the TFVN (0 .. 1); and 
the third element is the VCID (0 .. 63).
As to have a way for expressing also the selection of the Master Channel, the 'special' VCID value 99 is used to indicate that the VCID may have any value. Therefore the exact range specification is:
VCID ϵ {0 .. 63,99}    </type_definition>
    </parameter>
    <parameter oidBit="14" authorizingEntity="CSTS WG" name="requested-control-word-type">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>14</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the type of the OCFs that shall be delivered. It can take on three values:
- all control word types' - the service provider delivers all OCFs extracted from the selected telemetry channel, regardless of the control word type they contain;
- 'clcw' - the service provider delivers the OCFs extracted from the selected telemetry channel that contain CLCW reports;
- 'not clcw' - the service provider delivers the OCFs extracted from the selected telemetry channel that contain reports different from CLCWs.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   all-control-word-types   (0)
,   clcw   (1)
,   not-clcw   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="15" authorizingEntity="CSTS WG" name="requested-tc-vcid">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>15</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports which TC Master Channel or Virtual Channel the OCFs to be delivered shall be associated with. The parameter is a concatenation of the CCSDS assigned Spacecraft Identifier (SCID), the Transfer Frame Version Number (TFVN) and, if applicable, the Virtual Channel Identifier (VCID).
If requested-control-word-type ≠ clcw, this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (3)) OF IntUnsigned, where 
the first element is the SCID (0 .. 1023), 
the second element is the TFVN (0); and 
the third element is the VCID (0 .. 63).</type_definition>
    </parameter>
    <parameter oidBit="16" authorizingEntity="CSTS WG" name="requested-update-mode">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>16</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports the update mode applied by the ROCF service provider for the delivery of OCFs. It can take on two values:
- 'continuous' - the ROCF service provider delivers each OCF that fulfills the delivery criteria specified by the ROCF-START invocation parameters start-time, stop-time, requested-global-VCID, control-word-type, and tc-vcid;
- 'change-based' - the ROCF service provider delivers those OCFs that fulfill the delivery criteria specified by the ROCF-START invocation parameters start-time, stop-time, requested-global-VCID, control-word-type, and tc-vcid provided the content of the OCF is different than the one of the OCF with the same tc-vcid value previously delivered. </semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 1)
{   continuous   (0)
,   change-based   (1)
}</type_definition>
    </parameter>
    <parameter oidBit="17" authorizingEntity="CSTS WG" name="number-of-ocfs-delivered">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>36</oidBit>
        <oidBit>1</oidBit>
        <oidBit>17</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter reports the  total number of OCFs that were delivered to the user since the start of the service instance provision period.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="37" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="RUFT CSTS Provider">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>37</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="38" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="TDM Segment Generation">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>38</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="39" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="TDM Sink">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>39</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="40" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Raw Radio Metric Data Collection">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>40</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="41" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="D-DOR Raw Data Collection">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>41</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="42" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Open-Loop Receiver">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>42</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" name="open-loop-sampling-rate">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies in Hz the sampling rate used for the open-loop recording.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (1000 .. 2000000)</type_definition>
    </parameter>
    <parameter oidBit="2" authorizingEntity="CSTS WG" name="open-loop-quantization">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter specifies the quantization of the samples, i.e. the number of bits used to represent one sample. The following values are supported:
- '1 bit';
- '2 bit';
- '4 bit';
- '8 bit';
- '16 bit'.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 4)
{   1-bit   (0)
,   2-bit   (1)
,   4-bit   (2)
,   8-bit   (3)
,   16-bit   (4)
}</type_definition>
    </parameter>
    <parameter oidBit="3" authorizingEntity="CSTS WG" name="open-loop-center-frequency-offset-rhc">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the offset in Hz of the open-loop recording center frequency with respect to the nominal carrier return link conversion for right hand circular polarization.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (-100000000 .. 100000000)</type_definition>
    </parameter>
    <parameter oidBit="4" authorizingEntity="CSTS WG" name="open-loop-center-frequency-offset-lhc">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>4</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the offset in Hz of the open-loop recording center frequency with respect to the nominal carrier return link conversion for left hand circular polarization.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (-100000000 .. 100000000)</type_definition>
    </parameter>
    <parameter oidBit="5" authorizingEntity="CSTS WG" name="subchannel-1-offset">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>5</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the offset in Hz of the open-loop recording subchannel 1 center frequency with respect to the open-loop recording center frequency specified for the polarization selected for this subchannel. If this subchannel is 'off', this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (-80000000 .. 80000000)</type_definition>
    </parameter>
    <parameter oidBit="6" authorizingEntity="CSTS WG" name="subchannel-1-polarization">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>6</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if this subchannel is active and if so which polarization the input signal has. It can take on three values:
- 'off'  - the subchannel is not used for the current open-loop recording;
- 'rhc' - the right hand circular polarized signal is used as input to this sub-channel;
- 'lhc' - the left hand circular polarized signal is used as input to this sub-channel.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   off   (0)
,   rhc   (1)
,   lhc   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="7" authorizingEntity="CSTS WG" name="subchannel-2-offset">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>7</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the offset in Hz of the open-loop recording subchannel 2 center frequency with respect to the open-loop recording center frequency specified for the polarization selected for this subchannel. If this subchannel is 'off', this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (-80000000 .. 80000000)</type_definition>
    </parameter>
    <parameter oidBit="8" authorizingEntity="CSTS WG" name="subchannel-2-polarization">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>8</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if this subchannel is active and if so which polarization the input signal has. It can take on three values:
- 'off'  - the subchannel is not used for the current open-loop recording;
- 'rhc' - the right hand circular polarized signal is used as input to this sub-channel;
- 'lhc' - the left hand circular polarized signal is used as input to this sub-channel.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   off   (0)
,   rhc   (1)
,   lhc   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="9" authorizingEntity="CSTS WG" name="subchannel-3-offset">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>9</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the offset in Hz of the open-loop recording subchannel 3 center frequency with respect to the open-loop recording center frequency specified for the polarization selected for this subchannel. If this subchannel is 'off', this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (-80000000 .. 80000000)</type_definition>
    </parameter>
    <parameter oidBit="10" authorizingEntity="CSTS WG" name="subchannel-3-polarization">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>10</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if this subchannel is active and if so which polarization the input signal has. It can take on three values:
- 'off'  - the subchannel is not used for the current open-loop recording;
- 'rhc' - the right hand circular polarized signal is used as input to this sub-channel;
- 'lhc' - the left hand circular polarized signal is used as input to this sub-channel.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   off   (0)
,   rhc   (1)
,   lhc   (2)
}</type_definition>
    </parameter>
    <parameter oidBit="11" authorizingEntity="CSTS WG" name="subchannel-4-offset">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>11</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This parameter specifies the offset in Hz of the open-loop recording subchannel 4 center frequency with respect to the open-loop recording center frequency specified for the polarization selected for this subchannel. If this subchannel is 'off', this parameter shall be flagged as undefined.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF Integer (-80000000 .. 80000000)</type_definition>
    </parameter>
    <parameter oidBit="12" authorizingEntity="CSTS WG" name="subchannel-4-polarization">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>42</oidBit>
        <oidBit>1</oidBit>
        <oidBit>12</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>This enumerated parameter reports if this subchannel is active and if so which polarization the input signal has. It can take on three values:
- 'off'  - the subchannel is not used for the current open-loop recording;
- 'rhc' - the right hand circular polarized signal is used as input to this sub-channel;
- 'lhc' - the left hand circular polarized signal is used as input to this sub-channel.</semantic_definition>
      <type_definition>SEQUENCE (SIZE (1)) OF IntUnsigned (0 .. 2)
{   off   (0)
,   rhc   (1)
,   lhc   (2)
}</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="43" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="TDM Recording Buffer">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>43</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="44" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Raw Radio Metric Data Store">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>44</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="45" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="D-DOR Raw Data Store">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>45</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="46" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Open Loop Data Store">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>46</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="47" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Real-Time Tracking Data CSTS Provider">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>47</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" name="Production status">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>47</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>mm since 00:00 UTC</semantic_definition>
      <type_definition>Unsigned Integer</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="48" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Monitored Data CSTS Provider">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>48</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" name="Production time">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>48</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>mm since 00:00 UTC</semantic_definition>
      <type_definition>Unsigned Integer</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="49" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Monitored Data Collection">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>49</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" name="Production time">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>49</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>mm since 00:00 UTC</semantic_definition>
      <type_definition>Unsigned Integer</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="50" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Service Control CSTS Provider">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>50</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" name="Production time">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>50</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>mm since 00:00 UTC</semantic_definition>
      <type_definition>Unsigned Integer</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="51" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Service Control Production">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>51</oidBit>
    </oid>
    <parameter oidBit="1" authorizingEntity="CSTS WG" name="Production time">
      <oid>
        <oidBit>1</oidBit>
        <oidBit>3</oidBit>
        <oidBit>112</oidBit>
        <oidBit>4</oidBit>
        <oidBit>4</oidBit>
        <oidBit>2</oidBit>
        <oidBit>1</oidBit>
        <oidBit>51</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
        <oidBit>1</oidBit>
      </oid>
      <semantic_definition>mm since 00:00 UTC</semantic_definition>
      <type_definition>Unsigned Integer</type_definition>
    </parameter>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="52" authorizingEntity="CSTS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Forward IP-VC Map">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>52</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
  <functionalResource oidBit="53" authorizingEntity="STS WG" creationDate="2014-06-27T00:00:00.000+0200" name="Return IP over CCSDS Extractor/Router">
    <oid>
      <oidBit>1</oidBit>
      <oidBit>3</oidBit>
      <oidBit>112</oidBit>
      <oidBit>4</oidBit>
      <oidBit>4</oidBit>
      <oidBit>2</oidBit>
      <oidBit>1</oidBit>
      <oidBit>53</oidBit>
    </oid>
    <semantic_definition>none</semantic_definition>
  </functionalResource>
</fr:FunctionalResourceModel>
