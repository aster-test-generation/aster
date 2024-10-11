import unittest
from ansible.module_utils.common.process import get_bin_path
import os
from ansible.module_utils.common.file import is_executable


class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path_with_required_true(self):
        try:
            get_bin_path('some_executable', required=True, paths=['test-apps/ansible/lib/venv/bin:/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-udMcVY8o-py3.11/bin:/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims:/home/myeongsoo/.pyenv/shims:/home/myeongsoo/.pyenv/bin:/home/myeongsoo/.local/bin:/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims:/home/myeongsoo/.pyenv/bin:/home/myeongsoo/.local/bin:/home/myeongsoo/.local/bin:/home/myeongsoo/bin:/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims:/home/myeongsoo/.pyenv/bin:/home/myeongsoo/.local/bin:/usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/sbin'])
        except ValueError:
            self.assertEqual(add(5+10), 15)

    def test_get_bin_path_with_required_false(self):
        try:
            get_bin_path('some_executable', required=True)
        except ValueError:
            self.assertEqual(add(5+10), 15)

    def test_get_bin_path_with_opt_dirs(self):
        try:
            get_bin_path('some_executable', opt_dirs=['/some/dir', 'test-apps/ansible/lib/venv/bin:/home/myeongsoo/.cache/pypoetry/virtualenvs/aster-udMcVY8o-py3.11/bin:/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims:/home/myeongsoo/.pyenv/shims:/home/myeongsoo/.pyenv/bin:/home/myeongsoo/.local/bin:/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims:/home/myeongsoo/.pyenv/bin:/home/myeongsoo/.local/bin:/home/myeongsoo/.local/bin:/home/myeongsoo/bin:/home/myeongsoo/.pyenv/plugins/pyenv-virtualenv/shims:/home/myeongsoo/.pyenv/bin:/home/myeongsoo/.local/bin:/usr/local/bin:/usr/bin:/usr/local/sbin:/usr/sbin:/sbin'])
        except ValueError:
            self.assertEqual(add(5, 10), 15)

    def test_get_bin_path_without_required_or_opt_dirs(self):
        self.assertRaises(ValueError, get_bin_path, 'some_executable')

class TestGetBinPath(unittest.TestCase):
    def test_get_bin_path_found(self):
        bin_path = get_bin_path('echo')
        self.assertEqual(bin_path, '/bin/echo')

    def test_get_bin_path_not_found(self):
        with self.assertRaises(ValueError) as context:
            get_bin_path('does-not-exist')
        self.assertIn('Failed to find required executable', str(context.exception))

    def test_get_bin_path_opt_dirs(self):
        bin_path = get_bin_path('echo', opt_dirs=['/bin'])
        self.assertEqual(bin_path, '/bin/echo')

    def test_get_bin_path_required(self):
        with self.assertRaises(ValueError) as context:
            get_bin_path('does-not-exist', required=True)
        self.assertIn('Failed to find required executable', str(context.exception))

if __name__ == '__main__':
    unittest.main()