import unittest
from ansible.modules.dnf import *



class TestDnf(unittest.TestCase):
    def test_main(self):
        result = main()
        self.assertEqual(result, None)

    def test_run_command_dnf(self):
        result = run_command_dnf()
        self.assertEqual(result, None)

    def test_run_command_yum(self):
        result = run_command_yum()
        self.assertEqual(result, None)

    def test_run_command_rpm(self):
        result = run_command_rpm()
        self.assertEqual(result, None)

    def test_run_command_dpkgquery(self):
        result = run_command_dpkgquery()
        self.assertEqual(result, None)

    def test_run_command_zypper(self):
        result = run_command_zypper()
        self.assertEqual(result, None)

    def test_run_command_pacman(self):
        result = run_command_pacman()
        self.assertEqual(result, None)

    def test_run_command_apk(self):
        result = run_command_apk()
        self.assertEqual(result, None)

    def test_run_command_emerge(self):
        result = run_command_emerge()
        self.assertEqual(result, None)

    def test_run_command_xbps(self):
        result = run_command_xbps()
        self.assertEqual(result, None)

    def test_run_command_flatpak(self):
        result = run_command_flatpak()
        self.assertEqual(result, None)

    def test_run_command_snap(self):
        result = run_command_snap()
        self.assertEqual(result, None)

    def test_run_command_brew(self):
        result = run_command_brew()
        self.assertEqual(result, None)

    def test_run_command_portage(self):
        result = run_command_portage()
        self.assertEqual(result, None)

    def test_run_command_yay(self):
        result = run_command_yay()
        self.assertEqual(result, None)

    def test_run_command_pip(self):
        result = run_command_pip()
        self.assertEqual(result, None)

    def test_run_command_gem(self):
        result = run_command_gem()
        self.assertEqual(result, None)

    def test_run_command_npm(self):
        result = run_command_npm()
        self.assertEqual(result, None)

    def test_run_command_pear(self):
        result = run_command_pear()
        self.assertEqual(result, None)

    def test_run_command_cargo(self):
        result = run_command_cargo()
        self.assertEqual(result, None)

    def test_run_command_composer(self):
        result = run_command_composer()
        self.assertEqual(result, None)

    def test_run_command_npm_g(self):
        result = run_command_npm_g()
        self.assertEqual(result, None)

    def test_run_command_pip3(self):
        result = run_command_pip3()
        self.assertEqual(result, None)

    def test_run_command_gem_g(self):
        result = run_command_gem_g()
        self.assertEqual(result, None)

    def test_run_command_npm_g_g(self):
        result = run_command_npm_g_g()
        self.assertEqual(result, None)

    def test_run_command_yum(self):
        result = run_command_yum()
        self.assertEqual(result, None)

if __name__ == '__main__':
    unittest.main()