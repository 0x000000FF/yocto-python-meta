DESCRIPTION = "Config file reading, writing and validation."
HOMEPAGE = "https://pypi.python.org/pypi/configobj"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=79aa8b7bc4f781210d6b5c06d6424cb0"

PR = "r0"
SRCNAME = "configobj"

SRC_URI = "https://pypi.python.org/packages/source/c/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "e472a3a1c2a67bb0ec9b5d54c13a47d6"
SRC_URI[sha256sum] = "a2f5650770e1c87fb335af19a9b7eb73fc05ccf22144eb68db7d00cd2bcb0902"

S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

#RDEPENDS_${PN} += "python-werkzeug python-jinja2"
