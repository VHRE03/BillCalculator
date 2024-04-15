package previews

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ui.BillInputs
import ui.ResultsHeader

@Preview(showBackground = true)
@Composable
private fun ResultsHeaderPreview() {
    Box(modifier = Modifier.padding(16.dp)){
        ResultsHeader()
    }
}

@Preview(showBackground = true)
@Composable
fun BillInputsPreview() {
    Box(modifier = Modifier.padding(16.dp)){
        BillInputs()
    }
}