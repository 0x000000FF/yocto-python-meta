DESCRIPTION = "Easily download, build, install, upgrade, and uninstall Python packages"
HOMEPAGE = "https://pypi.python.org/pypi/Flask"
SECTION = "devel/python"
LICENSE = "PSF or ZPL"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=20c831f91dd3bd486020f672ba2be386"

PR = "r0"
SRCNAME = "setuptools"

SRC_URI = "https://pypi.python.org/packages/source/s/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "52b4e48939ef311d7204f8fe940764f4"
SRC_URI[sha256sum] = "0994a58df27ea5dc523782a601357a2198b7493dcc99a30d51827a23585b5b1d"


S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

