import unittest
from ansible.module_utils.common.process import *


class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path(self):
        result = get_bin_path("arg", ["/sbin", "/usr/sbin", "/usr/local/sbin", "/test-apps/ansible/lib/venv/bin", "/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-USaeMh6E-py3.11/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/.local/bin", "/home/myeongsoo/bin", "/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims", "/home/myeongsoo/.pyenv/bin", "/home/myeongsoo/.local/bin", "/usr/local/bin", "/usr/bin", "/usr/local/sbin", "/usr/sbin"], True)
        self.assertIsNotNone(result)

class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path(self):
        result = get_bin_path("arg", "opt_dirs", "required")
        self.assertEqual(result, "arg")

if __name__ == '__main__':
    unittest.main()