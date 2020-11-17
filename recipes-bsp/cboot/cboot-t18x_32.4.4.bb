DESCRIPTION = "cboot bootloader for Tegra186"

SRC_URI = "${L4T_URI_BASE}/cboot_src_t18x.tbz2;downloadfilename=cboot_src_t18x-${PV}.tbz2;subdir=${BP} \
           file://0001-Convert-Python-scripts-to-Python3.patch \
"
SRC_URI[sha256sum] = "c0921202b563089cd9d1e1860a6822e16729b08ce4b5e1fa5950ab784723cc3c"

TARGET_SOC = "t186"
COMPATIBLE_MACHINE = "(tegra186)"
PROVIDES_append = "${@' virtual/bootloader' if d.getVar('PREFERRED_PROVIDER_virtual/bootloader').startswith('cboot') else ''}"

require cboot-l4t.inc
