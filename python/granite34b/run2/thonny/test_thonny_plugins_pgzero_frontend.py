from thonny.plugins.pgzero_frontend import _OPTION_NAME
import unittest
from thonny.plugins.pgzero_frontend import *


class TestPGZeroFrontend(unittest.TestCase):
    def test_toggle_variable(self):
        var = get_workbench().get_variable(_OPTION_NAME)
        var.set(not var.get())
        update_environment()
        self.assertEqual(os.environ["PGZERO_MODE"], str(var.get()))

    def test_update_environment(self):
        if not get_workbench().in_simple_mode():
            os.environ["PGZERO_MODE"] = "auto"
        else:
            os.environ["PGZERO_MODE"] = str(get_workbench().get_option(_OPTION_NAME))
        self.assertEqual(os.environ["PGZERO_MODE"], str(get_workbench().get_option(_OPTION_NAME)))

    def test_load_plugin(self):
        get_workbench().set_default(_OPTION_NAME, True)
        get_workbench().add_command(
            "toggle_pgzero_mode",
            "run",
            tr("Pygame Zero mode"),
            toggle_variable,
            flag_name=_OPTION_NAME,
            group=40,
        )
        update_environment()
        self.assertEqual(get_workbench().get_option(_OPTION_NAME), False)

if __name__ == '__main__':
    unittest.main()