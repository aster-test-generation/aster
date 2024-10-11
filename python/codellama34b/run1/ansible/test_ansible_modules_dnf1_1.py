
import unittest
from ansible.modules.dnf import *

class TestDnfModule(unittest.TestCase):
    def test_specify_repositories(self):
        base = None
        disablerepo = None
        enablerepo = None
        dnf = DnfModule(None)
        dnf._specify_repositories(base, disablerepo, enablerepo)

    def test_ensure_dnf(self):
        dnf = DnfModule(None)
        dnf._ensure_dnf()

    def test_set_check_update(self):
        dnf = DnfModule(None)
        dnf._set_check_update()

    def test_set_install_update(self):
        dnf = DnfModule(None)
        dnf._set_install_update()

    def test_set_latest(self):
        dnf = DnfModule(None)
        dnf._set_latest()

    def test_set_latest_command(self):
        dnf = DnfModule(None)
        dnf._set_latest_command()

    def test_set_list(self):
        dnf = DnfModule(None)
        dnf._set_list()

    def test_set_list_update_packages(self):
        dnf = DnfModule(None)
        dnf._set_list_update_packages()

    def test_set_remove(self):
        dnf = DnfModule(None)
        dnf._set_remove()

    def test_set_install(self):
        dnf = DnfModule(None)
        dnf._set_install()

    def test_set_update(self):
        dnf = DnfModule(None)
        dnf._set_update()

    def test_set_update_command(self):
        dnf = DnfModule(None)
        dnf._set_update_command()

    def test_set_downgrade(self):
        dnf = DnfModule(None)
        dnf._set_downgrade()

    def test_set_autoremove(self):
        dnf = DnfModule(None)
        dnf._set_autoremove()

    def test_set_autoremove_command(self):
        dnf = DnfModule(None)
        dnf._set_autoremove_command()

    def test_set_clean(self):
        dnf = DnfModule(None)
        dnf._set_clean()

    def test_set_clean_command(self):
        dnf = DnfModule(None)
        dnf._set_clean_command()

    def test_set_makecache(self):
        dnf = DnfModule(None)
        dnf._set_makecache()

    def test_set_makecache_command(self):
        dnf = DnfModule(None)
        dnf._set_makecache_command()

    def test_set_check_update_command(self):
        dnf = DnfModule(None)
        dnf._set_check_update_command()

    def test_set_installroot(self):
        dnf = DnfModule(None)
        dnf._set_installroot()

    def test_set_releasever(self):
        dnf = DnfModule(None)
        dnf._set_releasever()

    def test_set_disable_excludes(self):
        dnf = DnfModule(None)
        dnf._set_disable_excludes()

    def test_set_disable_excludes_command(self):
        dnf = DnfModule(None)
        dnf._set_disable_excludes_command()

if __name__ == '__main__':
    unittest.main()