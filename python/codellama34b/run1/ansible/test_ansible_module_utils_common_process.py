import unittest
from ansible.module_utils.common.process import *



class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path(self):
        result = get_bin_path("arg", ["/sbin", "/usr/sbin", "/usr/local/sbin", "/test-apps/ansible/lib/venv/bin"], True)
        self.assertEqual(result, "/sbin/arg")

    def test_get_bin_path_2(self):
        result = get_bin_path("arg", ["/sbin", "/usr/sbin", "/usr/local/sbin", "/test-apps/ansible/lib/venv/bin"], False)
        self.assertEqual(result, "/sbin/arg")

    def test_get_bin_path_3(self):
        result = get_bin_path("arg", ["/sbin", "/usr/sbin", "/usr/local/sbin", "/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-CEpaBOsH-py3.11/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/usr/local/bin", "/usr/bin", "/usr/local/sbin", "/usr/sbin"], None)
        self.assertEqual(result, "/sbin/arg")

    def test_get_bin_path_4(self):
        result = get_bin_path("arg", None, False)
        self.assertEqual(result, "/sbin/arg")

    def test_get_bin_path_5(self):
        result = get_bin_path("arg", None, True)
        self.assertEqual(result, "/sbin/arg")

    def test_get_bin_path_6(self):
        result = get_bin_path("arg", None, None)
        self.assertEqual(result, "/sbin/arg")

    def test_get_bin_path_7(self):
        result = get_bin_path("arg", ["/sbin", "/usr/sbin", "/usr/local/sbin", "/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-CEpaBOsH-py3.11/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/usr/local/bin", "/usr/bin", "/usr/local/sbin", "/usr/sbin"], True)
        self.assertEqual(result, "/usr/sbin/arg")

    def test_get_bin_path_8(self):
        result = get_bin_path("arg", ["/sbin", "/usr/sbin", "/usr/local/sbin"], True)
        self.assertEqual(result, "/usr/sbin/arg")

    def test_get_bin_path_9(self):
        result = get_bin_path("arg", ["/sbin", "/usr/sbin", "/usr/local/sbin", "/test-apps/ansible/lib/venv/bin", "/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-CEpaBOsH-py3.11/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/usr/local/bin", "/usr/bin", "/usr/local/sbin", "/usr/sbin"], None)
        self.assertEqual(result, "/usr/sbin/arg")

    def test_get_bin_path_10(self):
        result = get_bin_path("arg", None, False)
        self.assertEqual(result, "/usr/sbin/arg")

    def test_get_bin_path_11(self):
        result = get_bin_path("arg", None, True)
        self.assertEqual(result, "/usr/sbin/arg")

    def test_get_bin_path_12(self):
        result = get_bin_path("arg", None, None)
        self.assertEqual(result, "/usr/sbin/arg")

    def test_get_bin_path_13(self):
        result = get_bin_path("arg", ["/sbin", "/usr/sbin", "/usr/local/sbin", "/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-CEpaBOsH-py3.11/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/usr/local/bin", "/usr/bin", "/usr/local/sbin", "/usr/sbin"], True)
        self.assertEqual(result, "/usr/local/sbin/arg")

    def test_get_bin_path_14(self):
        import os
        self.assertEqual(result, "/usr/local/sbin/arg")

    def test_get_bin_path_15(self):
        result = get_bin_path("arg", ["/sbin", "/usr/sbin", "/usr/local/sbin", "/test-apps/ansible/lib/venv/bin"], None)
        self.assertEqual(result, "/usr/local/sbin/arg")

    def test_get_bin_path_16(self):
        result = get_bin_path("arg", None, False)
        self.assertEqual(result, "/usr/local/sbin/arg")

if __name__ == '__main__':
    unittest.main()