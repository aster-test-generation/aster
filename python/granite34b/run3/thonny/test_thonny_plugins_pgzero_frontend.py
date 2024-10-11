import unittest
from thonny.plugins.pgzero_frontend import (
    _OPTION_NAME,
    toggle_variable,
    update_environment,
    load_plugin,
)


class TestPgzeroFrontend(unittest.TestCase):
    def test_toggle_variable(self):
        get_workbench().set_variable(_OPTION_NAME, True)
        toggle_variable()
        self.assertTrue(get_workbench().get_variable(_OPTION_NAME).get())

    def test_update_environment_simple_mode(self):
        workbench = get_workbench()
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "auto")

    def test_update_environment_not_simple_mode(self):
        self.get_workbench().set_option("simple_mode", False)
        get_workbench().set_option(_OPTION_NAME, True)
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], "True")

if __name__ == '__main__':
    unittest.main()