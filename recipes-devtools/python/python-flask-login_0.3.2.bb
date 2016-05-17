DESCRIPTION = "Flask is a microframework for Python based on Werkzeug, Jinja 2 and good intentions."
HOMEPAGE = "https://pypi.python.org/pypi/Flask"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8aa87a1cd9fa41d969ad32cfdac2c596"

PR = "r0"
SRCNAME = "Flask-Login"

SRC_URI = "https://pypi.python.org/packages/source/F/${SRCNAME}/${SRCNAME}-${PV}.tar.gz"

SRC_URI[md5sum] = "d95c2275d3e1c755145910077366dc45"
SRC_URI[sha256sum] = "e72eff5c35e5a31db1aeca1db5d2501be702674ea88e8f223b5d2b11644beee6"


S = "${WORKDIR}/${SRCNAME}-${PV}"

inherit setuptools

